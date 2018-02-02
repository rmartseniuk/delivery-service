package com.epam.martseniuk.repository;

import com.epam.martseniuk.entity.NotificationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Roman_Martseniuk
 */
public interface NotificationRepository extends MongoRepository<NotificationEntity, String> {

    List<NotificationEntity> findByPriority(String priority);
}
