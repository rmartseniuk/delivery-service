package com.epam.martseniuk.resource;

import com.epam.martseniuk.dto.Account;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Roman_Martseniuk
 */
@RequestMapping("/account")
public interface AccountResource {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Account createAccount(@RequestBody Account account);

    @RequestMapping(value = "/get/{accountId}", method = RequestMethod.GET)
    Account getAccountById(@PathVariable(value = "accountId") String accountId);

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    void updateAccount(@RequestBody Account account);
}
