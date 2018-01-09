package com.epam.martseniuk.repository;

import com.epam.martseniuk.dto.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Roman_Martseniuk
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
