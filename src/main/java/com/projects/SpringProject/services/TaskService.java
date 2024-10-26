package com.projects.SpringProject.services;

import com.projects.SpringProject.models.Task;

import java.util.List;


// Интерфейс расширяемый классом RepoTaskServiceImpl
public interface TaskService {

    List<Task> getAllTasks();
    Task getTaskById(long id);
    List<Task> getAllByCategory(int category);
    List<Task> getAllByStatus(boolean isCompleted);
    void addTask(Task task);
    void updateTask(Task task);
    void deleteTask(long id);
    void deleteAllTasks();
}
