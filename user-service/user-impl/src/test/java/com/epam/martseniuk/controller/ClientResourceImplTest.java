package com.epam.martseniuk.controller;

import com.epam.martseniuk.dto.Client;
import com.epam.martseniuk.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Roman_Martseniuk
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"spring.data.mongodb.host=localhost", "spring.data.mongodb.port=0"})
public class ClientResourceImplTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRepositoryCustom userRepositoryCustom;

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() throws Exception {
        userRepository.deleteAll();
        Client validClient = getValidUser();
        validClient.setId("testId");
//        userRepository.insert(validClient);
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @After
    public void tearDown() throws Exception {
        userRepository.deleteAll();
    }

    @Test
    public void testGetUserById() throws Exception {
        Client client = getValidUser();
        client.setId("testId");
        this.mockMvc.perform(get("/client/testId").contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(createJsonFromObject(client)))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testGetUserByEmail() throws Exception {
        Client client = getValidUser();
        client.setId("testId");
        MvcResult mvcResult = this.mockMvc.perform(get("/client/").param("email", "bilbo_beggins@gmail.com").contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(createJsonFromObject(client)))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testGetUsersByName() throws Exception {
        userRepository.deleteAll();
        List<Client> clients = getListUsers();
//        userRepository.insert(clients.get(0));
//        userRepository.insert(clients.get(1));
        MvcResult mvcResult = this.mockMvc.perform(get("/clients")
                    .param("name", "Bilbo")
                    .param("pageSize", "3")
                    .param("pageNum", "1").contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(createJsonFromObject(clients)))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testCreateUserWithValidValues() throws Exception {
        String jsonUser = createJsonFromObject(getValidUser());
        MvcResult mvcResult = this.mockMvc.perform(post("/user/").contentType(MediaType.APPLICATION_JSON).content(jsonUser))
                .andExpect(status().isOk())
                .andReturn();
        String jsonCreatedUser = mvcResult.getResponse().getContentAsString();
        Client createdClient = createObjectFromJson(jsonCreatedUser, Client.class);
        assertNotNull(createdClient.getId());
    }

    @Test
    public void testUpdateUser() throws Exception {
        Client client = getValidUser();
        client.setName("Bilbo_Beggins");
        String jsonUser = createJsonFromObject(client);
        MvcResult mvcResult = this.mockMvc.perform(put("/client/").contentType(MediaType.APPLICATION_JSON).content(jsonUser))
                .andExpect(status().isOk())
                .andReturn();
        String jsonUpdateUser = mvcResult.getResponse().getContentAsString();
        Client updateClient = createObjectFromJson(jsonUpdateUser, Client.class);
        assertNotEquals(getValidUser().getName(), updateClient.getName());

    }

    @Test
    public void testDeleteUser() throws Exception {
        this.mockMvc.perform(delete("/user/testId"))
                .andExpect(status().isOk())
                .andReturn();
        assertNull(userRepository.findOne("testId"));
    }

    private List<Client> getListUsers() {
        List<Client> clients = new ArrayList<>();
        Client client = getValidUser();
        client.setId("1");
        clients.add(client);
        Client client2 = getValidUser();
        client2.setId("2");
        clients.add(client2);
        return clients;
    }

    private String createJsonFromObject(Object object) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(object);
    }

    private <T> T createObjectFromJson(String json, Class<T> valueType) throws IOException {
        return new ObjectMapper().readValue(json, valueType);
    }

    private Client getValidUser() {
        Client client = new Client();
        client.setName("Bilbo");
        client.setEmail("bilbo_beggins@gmail.com");
        return client;
    }
}