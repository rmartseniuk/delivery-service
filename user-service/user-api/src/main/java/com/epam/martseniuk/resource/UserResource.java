package com.epam.martseniuk.resource;

import com.epam.martseniuk.dto.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Roman_Martseniuk
 */
@RequestMapping("/user")
public interface UserResource {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    User createUser(@RequestBody User user);

    @RequestMapping(value = "/get/{userId}", method = RequestMethod.GET)
    User getUserById(@PathVariable String userId);
}
