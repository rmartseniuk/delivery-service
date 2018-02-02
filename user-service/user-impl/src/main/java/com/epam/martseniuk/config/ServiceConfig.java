package com.epam.martseniuk.config;

import com.epam.martseniuk.repository.AccountRepository;
import com.epam.martseniuk.repository.UserRepository;
import com.epam.martseniuk.service.AccountService;
import com.epam.martseniuk.service.UserService;
import com.epam.martseniuk.service.impl.AccountServiceImpl;
import com.epam.martseniuk.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Roman_Martseniuk
 */
@Configuration
public class ServiceConfig {

    @Bean
    public AccountService accountService(AccountRepository accountRepository) {
        AccountServiceImpl accountService = new AccountServiceImpl();
        accountService.setAccountRepository(accountRepository);
        return accountService;
    }

    @Bean
    public UserService userService(UserRepository userRepository) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserRepository(userRepository);
        return userService;
    }

}
