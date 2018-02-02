package com.epam.martseniuk.resource;

import com.epam.martseniuk.dto.Account;
import com.epam.martseniuk.repository.AccountRepository;
import com.epam.martseniuk.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman_Martseniuk
 */
@RestController
public class AccountResourceImpl implements AccountResource {

    @Autowired
    private AccountService accountService;

    @Override
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @Override
    public Account getAccountById(@PathVariable(value = "accountId") String accountId) {
        return accountService.getAccountById(accountId);
    }

    @Override
    public void updateAccount(Account account) {
        accountService.updateAccount(account);
    }

}
