package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TaskkStore;

public interface TaskRepository extends JpaRepository<TaskkStore, Long> {

    List<TaskkStore> findAllByOrderByIdAsc();
}
