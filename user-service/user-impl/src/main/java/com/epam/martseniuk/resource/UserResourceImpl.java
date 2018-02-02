package com.epam.martseniuk.resource;


import com.epam.martseniuk.dto.User;
import com.epam.martseniuk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Roman_Martseniuk
 */
@RestController
public class UserResourceImpl implements UserResource {

    @Autowired
    private UserService userService;

    @Override
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @Override
    public User getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }


}
