package com.projects.SpringProject.models;

import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

//Модель для таблицы
@Data
@Entity
@Table(name = "tasks")
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @NonNull
    private Integer category;

    @NonNull
    private Boolean isCompleted;
}
