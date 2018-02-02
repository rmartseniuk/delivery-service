package com.epam.martseniuk.resource;

import com.epam.martseniuk.dto.Task;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.security.Principal;

/**
 * @author Roman_Martseniuk
 */
@RequestMapping("/task")
public interface TaskResource {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Task createTask(@RequestBody Task task, Principal principal);

    @RequestMapping(value = "/get/{taskId}", method = RequestMethod.GET)
    Task findTask(@PathVariable(value = "taskId") String taskId);

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    Task updateTask(@RequestBody Task task);

    @RequestMapping(value = "/delete/{taskId}", method = RequestMethod.DELETE)
    Task deleteTask(@PathVariable(value = "taskId") String taskId);
}
