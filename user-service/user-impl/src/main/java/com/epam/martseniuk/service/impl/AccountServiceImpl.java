package com.epam.martseniuk.service.impl;

import com.epam.martseniuk.dto.Account;
import com.epam.martseniuk.repository.AccountRepository;
import com.epam.martseniuk.service.AccountService;
import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * @author Roman_Martseniuk
 */
@Service
@Setter
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account getAccountById(String accountId) {
        return accountRepository.findOne(accountId);
    }

    @Override
    public void updateAccount(Account account) {
        accountRepository.save(account);
    }
}
