package com.epam.martseniuk.repository;

import com.epam.martseniuk.dto.DeliveryStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Roman_Martseniuk
 */
public interface DeliveryStatusRepository extends MongoRepository<DeliveryStatus, String> {
}
