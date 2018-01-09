package com.epam.martseniuk.service;


import com.epam.martseniuk.dto.Client;
import com.epam.martseniuk.dto.Courier;
import com.epam.martseniuk.dto.User;

import java.util.List;

/**
 * @author Roman_Martseniuk
 */
public interface UserService {

    User createUser(User user);

    User getUserById(String userName);
}
