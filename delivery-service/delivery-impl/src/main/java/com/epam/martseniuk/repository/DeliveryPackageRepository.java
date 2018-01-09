package com.epam.martseniuk.repository;

import com.epam.martseniuk.dto.DeliveryPackage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Roman_Martseniuk
 */
public interface DeliveryPackageRepository extends MongoRepository<DeliveryPackage, String> {
}
