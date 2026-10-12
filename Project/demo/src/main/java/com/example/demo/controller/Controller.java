package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TaskkStore;
import com.example.demo.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class Controller {
    private final TaskService taskService;

    public Controller(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<TaskkStore> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public TaskkStore getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public TaskkStore createTask(@RequestBody TaskkStore task) {
        return taskService.saveTask(task);
    }

    @PutMapping("/{id}")
    public TaskkStore updateTask(@PathVariable Long id, @RequestBody TaskkStore task) {
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
