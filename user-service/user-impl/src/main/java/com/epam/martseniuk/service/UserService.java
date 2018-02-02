package com.epam.martseniuk.service;


import com.epam.martseniuk.dto.User;

/**
 * @author Roman_Martseniuk
 */
public interface UserService {

    User createUser(User user);

    User getUserById(String userName);
}
