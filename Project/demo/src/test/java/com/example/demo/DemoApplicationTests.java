package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.TaskRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private TaskRepository taskRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldSupportRetrievingTasksInAscendingIdOrder() {
		assertNotNull(taskRepository.findAllByOrderByIdAsc());
	}

}
