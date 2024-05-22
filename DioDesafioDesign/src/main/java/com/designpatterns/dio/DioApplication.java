package com.designpatterns.dio;

import com.designpatterns.dio.model.Task;
import com.designpatterns.dio.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DioApplication implements CommandLineRunner {

    @Autowired
    private TaskService taskService;

    public static void main(String[] args) {
        SpringApplication.run(DioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Task task1 = new Task(1L, "Task 1", "Description 1", "Work", "Pending", "2024-06-01");
        Task task2 = new Task(2L, "Task 2", "Description 2", "Study", "Completed", "2024-06-02");
        taskService.addTask(task1);
        taskService.addTask(task2);
    }
}
