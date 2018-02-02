package com.epam.martseniuk.service.impl;

import com.epam.martseniuk.dto.User;
import com.epam.martseniuk.repository.UserRepository;
import com.epam.martseniuk.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Roman_Martseniuk
 */
@Service
@Setter
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findOne(userId);
    }
}
