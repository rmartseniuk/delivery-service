package com.epam.martseniuk.service;

import com.epam.martseniuk.dto.Task;

/**
 * @author Roman_Martseniuk
 */
public interface TaskService {

    Task createTask(Task task);

    Task findTask(String taskId);

    Task updateTask(Task task);

    Task deleteTask(String taskId);
}
