package com.epam.martseniuk.repository;

import com.epam.martseniuk.dto.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Roman_Martseniuk
 */
public interface TaskRepository extends MongoRepository<Task, String> {
}
