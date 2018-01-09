package com.epam.martseniuk.service;

import com.epam.martseniuk.dto.User;

/**
 * @author Roman_Martseniuk
 */
public interface UserService {

    User findByUsername(String userName);
}
