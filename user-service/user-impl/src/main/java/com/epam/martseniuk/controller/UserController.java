package com.epam.martseniuk.controller;


import com.epam.martseniuk.dto.User;
import com.epam.martseniuk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Roman_Martseniuk
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable(value = "id") String userName) {
        return userService.getUserById(userName);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User createNewUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
