package com.epam.martseniuk.controller;

import com.epam.martseniuk.dto.Client;
import com.epam.martseniuk.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman_Martseniuk
 */
@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/client/{id}", method = RequestMethod.GET)
    public Client getUserById(@PathVariable(value = "id") String id) {
        return clientService.getClientById(id);
    }

    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public Client createNewUser(@RequestBody Client client) {
        return clientService.createClient(client);
    }

}
