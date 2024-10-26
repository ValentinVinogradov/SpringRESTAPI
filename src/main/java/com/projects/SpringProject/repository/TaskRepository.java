package com.projects.SpringProject.repository;

import com.projects.SpringProject.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


//Интерфейс, используемый в RepoTaskServiceImpl
public interface TaskRepository extends JpaRepository<Task, Long> {
    // SELECT t FROM Task t WHERE t.category = ?1
    List<Task> getAllByCategory(int category);
    @Query("SELECT t FROM Task t WHERE t.isCompleted = ?1")
    List<Task> getAllByStatus(boolean isComplete);
}
