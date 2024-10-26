package com.projects.SpringProject.impl;

import com.projects.SpringProject.models.Task;
import com.projects.SpringProject.services.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

// Сервис, оперирующий данными внутри приложения (буфером)
@Service
public class InMemoryTaskServiceImpl implements TaskService {

    @Override
    public List<Task> getAllTasks () {
        return null;
    }

    @Override
    public void addTask(Task task) {
    }

    @Override
    public Task getTaskById(long id) {
        return null;
    }

    @Override
    public List<Task> getAllByCategory(int category) {
        return List.of();
    }

    @Override
    public List<Task> getAllByStatus(boolean isCompleted) {
        return List.of();
    }

    @Override
    public void updateTask(Task task) {
    }

    @Override
    public void deleteTask(long id) {

    }

    @Override
    public void deleteAllTasks() {

    }
}
