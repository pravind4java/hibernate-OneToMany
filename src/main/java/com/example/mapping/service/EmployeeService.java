package com.example.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.entity.Department;
import com.example.mapping.entity.Employee;
import com.example.mapping.reository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentService departmentService;

	public Employee addEmployeeToDepartment(Long departmentId, Employee emp) {
		Department dept = departmentService.getDepartmentById(departmentId);
		emp.setDepartment(dept);
		return employeeRepository.save(emp);
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
}
