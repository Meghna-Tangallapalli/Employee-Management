package com.emptask.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emptask.api.service.EmployeeService;
import com.emptask.api.vo.EmployeeVo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmpl")
	public ResponseEntity<EmployeeVo> saveEmp(@RequestBody EmployeeVo employeeVo){		
		return new ResponseEntity<>(employeeService.saveEmp(employeeVo), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getEmp")
	public ResponseEntity<EmployeeVo> getById(@RequestParam long id) throws Exception{	
		return new ResponseEntity<>(employeeService.getById(id), HttpStatus.OK);
		
	}
}
