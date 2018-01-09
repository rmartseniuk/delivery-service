package com.epam.martseniuk.repository;

import com.epam.martseniuk.dto.Courier;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Roman_Martseniuk
 */
public interface CourierRepository extends CrudRepository<Courier, String> {
}
