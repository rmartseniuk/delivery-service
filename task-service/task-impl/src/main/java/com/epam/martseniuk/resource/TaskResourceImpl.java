package com.epam.martseniuk.resource;

import com.epam.martseniuk.dto.Task;
import com.epam.martseniuk.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author Roman_Martseniuk
 */
@RestController
public class TaskResourceImpl implements TaskResource {

    @Autowired
    private TaskService taskService;

    @Override
    public Task createTask(@RequestBody Task task, Principal principal) {
        System.err.println(principal.getName());
        return taskService.createTask(task);
    }

    @Override
    public Task findTask(@PathVariable(value = "taskId") String taskId) {
        return taskService.findTask(taskId);
    }

    @Override
    public Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @Override
    public Task deleteTask(@PathVariable(value = "taskId") String taskId) {
        return taskService.deleteTask(taskId);
    }
}
