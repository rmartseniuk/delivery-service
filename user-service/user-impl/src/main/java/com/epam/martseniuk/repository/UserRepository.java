package com.epam.martseniuk.repository;

import com.epam.martseniuk.dto.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Roman_Martseniuk
 */
public interface UserRepository extends CrudRepository<User, String> {
}
