package com.epam.martseniuk.service;

import com.epam.martseniuk.dto.Account;

/**
 * @author Roman_Martseniuk
 */
public interface AccountService {

    Account createAccount(Account account);

    Account getAccountById(String accountId);

    void updateAccount(Account account);
}
