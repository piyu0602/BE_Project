package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.entity.TaskModel;
import com.exception.TaskException;
import com.repository.TaskRepository;

public class TaskController {

	@Autowired
//	private UserRepository userRepository;
	private TaskRepository taskRepository;

	@GetMapping("/taskdata")
	public List<TaskModel> getAllTasks() {
		return taskRepository.findAll();
	}

	@GetMapping("/taskdata/{id}")
	public ResponseEntity<TaskModel> getTaskById(@PathVariable(value = "task_id") Long taskId)
			throws TaskException {
		TaskModel task = taskRepository.findById(taskId)
				.orElseThrow(() -> new TaskException("Task not found for this id :: " + taskId));
		return ResponseEntity.ok().body(task);
	}

	@PostMapping("/taskdata")
	public TaskModel createTask(@RequestBody TaskModel task) {
		return taskRepository.save(task);
	}
}
