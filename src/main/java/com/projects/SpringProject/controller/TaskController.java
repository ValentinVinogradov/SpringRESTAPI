package com.projects.SpringProject.controller;

import com.projects.SpringProject.models.Task;
import com.projects.SpringProject.services.TaskService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Контроллер - 1й уровень логики, реализация HTTP запросов
@RestController
@RequestMapping("/taskio_api/v1/tasks")
@RequiredArgsConstructor
class TaskController {

    @NonNull
    private TaskService taskService;

    @GetMapping("/")
    public List<Task> getAllTasks () {
        System.out.println(taskService.getAllTasks());
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable long id) {
        return taskService.getTaskById(id);
    }

    @GetMapping("/status/{isCompleted}")
    public List<Task> getTasksByStatus(@PathVariable boolean isCompleted) {
        return taskService.getAllByStatus(isCompleted);
    }

    @GetMapping("/category/{category}")
    public List<Task> getAllTasksByCategory(@PathVariable int category) {
        return taskService.getAllByCategory(category);
    }

    @PostMapping("/add_task")
    public void addTask(@RequestBody Task task) {
        taskService.addTask(task);
    }

    @PutMapping("/update_task")
    public void updateTask(@RequestBody Task task) {
        taskService.updateTask(task);
    }

    @DeleteMapping("/delete_task/{id}")
    public void deleteTask(@PathVariable long id) {
        taskService.deleteTask(id);
    }

    @DeleteMapping("/delete_tasks")
    public void deleteAllTasks() {
        taskService.deleteAllTasks();
    }
}
