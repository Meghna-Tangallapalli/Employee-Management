package com.emptask.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String department;
	private String salary;
	private String achievements;
	private String designation;
	private String currentWorkingProject;
	private String company;
    private String reportingManager; 
	private String phoneNumber;

}
