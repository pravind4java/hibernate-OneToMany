package com.example.mapping.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Department implements Serializable {

	private static final long serialVersionUID = -6658813973489845953L;

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy="department", cascade=CascadeType.ALL, orphanRemoval = true)
	private List<Employee> employees = new ArrayList<>();
}
