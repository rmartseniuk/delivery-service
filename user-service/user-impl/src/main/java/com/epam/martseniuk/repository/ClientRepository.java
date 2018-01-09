package com.epam.martseniuk.repository;

import com.epam.martseniuk.dto.Client;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Roman_Martseniuk
 */
public interface ClientRepository extends CrudRepository<Client, String> {
}
