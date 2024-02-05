package com.emptask.api.service;

import org.springframework.stereotype.Component;

import com.emptask.api.vo.EmployeeVo;

@Component
public interface EmployeeService {

	EmployeeVo saveEmp(EmployeeVo employeeVo);
	
	EmployeeVo getById(long id) throws Exception;
}
