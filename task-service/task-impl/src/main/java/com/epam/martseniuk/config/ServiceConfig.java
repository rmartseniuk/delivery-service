package com.epam.martseniuk.config;

import com.epam.martseniuk.client.AccountResourceClient;
import com.epam.martseniuk.repository.TaskRepository;
import com.epam.martseniuk.service.TaskService;
import com.epam.martseniuk.service.impl.TaskServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Roman_Martseniuk
 */
@Configuration
public class ServiceConfig {

    @Bean
    TaskService taskService(TaskRepository taskRepository, AccountResourceClient accountResourceClient) {
        TaskServiceImpl taskService = new TaskServiceImpl();
        taskService.setTaskRepository(taskRepository);
        taskService.setAccountResourceClient(accountResourceClient);
        return taskService;
    }

}
