package com.example.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.entity.Employee;
import com.example.mapping.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/department/{departmentId}")
	public Employee addEmployeeToDepartment(
			@PathVariable Long departmentId, 
			@RequestBody Employee employee) {
		return employeeService.addEmployeeToDepartment(departmentId, employee);
	}

	@GetMapping()
	public ResponseEntity<List<Employee>> getAllEmployee() {
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(), HttpStatus.OK) ;
	}
}
