package com.designpatterns.dio.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private Long id;
    private String title;
    private String description;
    private String category;
    private String status;
    private String dueDate;

    public Task(Long id, String title, String description, String category, String status, String dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.status = status;
        this.dueDate = dueDate;
    }
}
