package com.example.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.entity.Department;
import com.example.mapping.reository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department createDepartment(Department dept) {
		return departmentRepository.save(dept);
	}

	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	public Department getDepartmentById(Long id) {
		return departmentRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Department not found with id: " + id));
	}
}
