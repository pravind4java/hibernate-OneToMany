package com.example.mapping.reository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
