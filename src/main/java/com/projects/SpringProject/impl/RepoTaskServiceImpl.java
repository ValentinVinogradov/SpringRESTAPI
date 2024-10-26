package com.projects.SpringProject.impl;

import com.projects.SpringProject.models.Task;
import com.projects.SpringProject.repository.TaskRepository;
import com.projects.SpringProject.services.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


//Реализация SQL запросов
//Сервис, оперирующий данными в базе данных
@Primary
@AllArgsConstructor
@Service
public class RepoTaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public List<Task> getAllByCategory(int category) {
        List<Task> tasks = taskRepository.getAllByCategory(category);
        return tasks.isEmpty() ? null : tasks;
    }

    @Override
    public List<Task> getAllByStatus(boolean isCompleted) {
        List<Task> tasks = taskRepository.getAllByStatus(isCompleted);
        return tasks.isEmpty() ? null : tasks;
    }

    @Override
    public void addTask(Task task) {
        taskRepository.save(task);
    }


    @Override
    public void updateTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void deleteTask(long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public void deleteAllTasks() {
        taskRepository.deleteAll();
    }
}
