package com.example.mapping.reository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
