package com.example.demo.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.TaskkStore;
import com.example.demo.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskkStore> getAllTasks() {
        return taskRepository.findAllByOrderByIdAsc();
    }

    public TaskkStore getTaskById(Long id) {
        if (id == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Task id is required");
        }
        return taskRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found: " + id));
    }

    public TaskkStore saveTask(TaskkStore task) {
        return taskRepository.save(task);
    }

    public TaskkStore updateTask(Long id, TaskkStore task) {
        if (id == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Task id is required");
        }

        TaskkStore existingTask = taskRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found: " + id));

        existingTask.setTitle(task.getTitle());
        existingTask.setDescription(task.getDescription());

        return taskRepository.save(existingTask);
    }

    public void deleteTask(Long id) {
        if (id == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Task id is required");
        }

        TaskkStore task = taskRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found: " + id));
        taskRepository.delete(task);
    }
}
