package com.epam.martseniuk.repository;

import com.epam.martseniuk.dto.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Roman_Martseniuk
 */
public interface AccountRepository extends CrudRepository<Account, String> {
}
