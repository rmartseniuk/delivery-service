package com.epam.martseniuk.service.impl;

import com.epam.martseniuk.dto.User;
import com.epam.martseniuk.repository.UserRepository;
import com.epam.martseniuk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Roman_Martseniuk
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String userName) {
        return userRepository.findOne(userName);
    }
}
