package com.epam.martseniuk.service.impl;

import com.epam.martseniuk.client.AccountResourceClient;
import com.epam.martseniuk.dto.Account;
import com.epam.martseniuk.dto.Task;
import com.epam.martseniuk.repository.TaskRepository;
import com.epam.martseniuk.service.TaskService;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

/**
 * @author Roman_Martseniuk
 */
@Setter
public class TaskServiceImpl implements TaskService {

    private AccountResourceClient accountResourceClient;

    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        if (checkIsNull(task) && checkAccountNotExist(task)) {
            throw new IllegalArgumentException();
        }
        updateAccounts(task);
        return taskRepository.insert(task);
    }

    @Override
    public Task findTask(String taskId) {
        return taskRepository.findOne(taskId);
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task deleteTask(String taskId) {
        Task task = taskRepository.findOne(taskId);
        taskRepository.delete(task);
        return task;
    }

    private boolean checkIsNull(Task task) {
        return Objects.isNull(task.getAssigneeId()) && Objects.isNull(task.getReporterId());
    }

    private boolean checkAccountNotExist(Task task) {
        Account assigneeAccount = accountResourceClient.getAccountById(task.getAssigneeId());
        Account reporterAccount = accountResourceClient.getAccountById(task.getReporterId());
        return Objects.isNull(assigneeAccount) && Objects.isNull(reporterAccount);
    }

    private void updateAccounts(Task task) {
        Account assigneeAccount = accountResourceClient.getAccountById(task.getAssigneeId());
        List<String> assignedTasks = assigneeAccount.getAssignedTasks();
        assignedTasks.add(task.getTaskId());
        assigneeAccount.setAssignedTasks(assignedTasks);
        accountResourceClient.updateAccount(assigneeAccount);

        Account reporterAccount = accountResourceClient.getAccountById(task.getReporterId());
        List<String> reporterTasks = reporterAccount.getReporterTasks();
        reporterTasks.add(task.getTaskId());
        reporterAccount.setReporterTasks(reporterTasks);
        accountResourceClient.updateAccount(reporterAccount);
    }
}
