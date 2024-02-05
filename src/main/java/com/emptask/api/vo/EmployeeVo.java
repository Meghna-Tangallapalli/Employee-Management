package com.emptask.api.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeVo {

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
