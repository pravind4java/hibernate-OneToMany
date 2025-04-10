package com.example.mapping.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Employee implements Serializable{

	private static final long serialVersionUID = 8841791485267582241L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
}
