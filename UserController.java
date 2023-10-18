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
import com.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/userdata")
	public List<UserModel> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/userdata/{id}")
	public ResponseEntity<UserModel> getUserById(@PathVariable(value = "id") Long userId)
			throws UserException {
		UserModel user = userRepository.findById(userId)
				.orElseThrow(() -> new UserException("User not found for this id :: " + userId));
		return ResponseEntity.ok().body(user);
	}

	@PostMapping("/userdata")
	public UserModel createUser(@RequestBody UserModel user) {
		return userRepository.save(user);
	}

//	@PutMapping("/employees/{id}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
//			@RequestBody Employee employeeDetails) throws ResourceNotFoundException {
//		Employee employee = employeeRepository.findById(employeeId)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//
//		employee.setEmailId(employeeDetails.getEmailId());
//		employee.setLastName(employeeDetails.getLastName());
//		employee.setFirstName(employeeDetails.getFirstName());
//		final Employee updatedEmployee = employeeRepository.save(employee);
//		return ResponseEntity.ok(updatedEmployee);
//	}

//	@DeleteMapping("/employees/{id}")
//	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
//			throws ResourceNotFoundException {
//		Employee employee = employeeRepository.findById(employeeId)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//
//		employeeRepository.delete(employee);
//		Map<String, Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return response;
//	}
}

