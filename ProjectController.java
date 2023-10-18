package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.entity.*;
import com.exception.UserException;
import com.exception.ProjectException;
//import com.repository.UserRepository;
import com.repository.ProjectRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class ProjectController {
	@Autowired
//	private UserRepository userRepository;
	private ProjectRepository projectRepository;

	@GetMapping("/projectdata")
	public List<ProjectModel> getAllProjects() {
		return projectRepository.findAll();
	}

	@GetMapping("/projectdata/{id}")
	public ResponseEntity<ProjectModel> getProjectById(@PathVariable(value = "proj_id") Long projId)
			throws ProjectException {
		ProjectModel project = projectRepository.findById(projId)
				.orElseThrow(() -> new ProjectException("Project not found for this id :: " + projId));
		return ResponseEntity.ok().body(project);
	}

	@PostMapping("/projectdata")
	public ProjectModel createProject(@RequestBody ProjectModel project) {
		return projectRepository.save(project);
	}
}