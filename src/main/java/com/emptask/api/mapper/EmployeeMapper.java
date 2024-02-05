package com.emptask.api.mapper;

import org.springframework.stereotype.Component;

import com.emptask.api.entity.Employee;
import com.emptask.api.vo.EmployeeVo;

@Component
public class EmployeeMapper {


	public EmployeeVo entityToVo(Employee save) {
		
		EmployeeVo employeeVo = EmployeeVo.builder()
				.id(save.getId())
				.name(save.getName())
				.salary(save.getSalary())
				.achievements(save.getAchievements())
				.designation(save.getDesignation())
				.currentWorkingProject(save.getCurrentWorkingProject())
				.department(save.getDepartment())
				.company(save.getCompany())
				.reportingManager(save.getReportingManager())
				.phoneNumber(save.getPhoneNumber())
				.build();
		return employeeVo;
	}
	
	public Employee voToEntity(EmployeeVo employeeVo) {
		
		Employee employee = Employee.builder()
				.id(employeeVo.getId())
				.name(employeeVo.getName())
				.salary(employeeVo.getSalary())
				.achievements(employeeVo.getAchievements())
				.designation(employeeVo.getDesignation())
				.currentWorkingProject(employeeVo.getCurrentWorkingProject())
				.department(employeeVo.getDepartment())
				.company(employeeVo.getCompany())
				.reportingManager(employeeVo.getReportingManager())
				.phoneNumber(employeeVo.getPhoneNumber())
				.build();
		return employee;
	}
}
