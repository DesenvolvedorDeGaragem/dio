package com.designpatterns.dio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private String category;
    private String status;
    private String dueDate;

    // Getters and Setters
}
