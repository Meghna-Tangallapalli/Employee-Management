package com.emptask.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emptask.api.entity.Employee;
import com.emptask.api.mapper.EmployeeMapper;
import com.emptask.api.repository.EmployeeRepository;
import com.emptask.api.vo.EmployeeVo;
import com.emptask.api.vo.EmployeeVo.EmployeeVoBuilder;

@Service 
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public EmployeeVo saveEmp(EmployeeVo employeeVo) {
		
		Employee employee = employeeMapper.voToEntity(employeeVo);
		
		Employee save = employeeRepository.save(employee);
		
		EmployeeVo employeeVO = employeeMapper.entityToVo(save);
				
		return employeeVO;
	}


	

	@Override
	public EmployeeVo getById(long id) throws Exception {
		Optional<Employee> employee = employeeRepository.findById(id);
		EmployeeVo response = null;
		if (employee.isPresent()) {
			Employee emp = employee.get();
			
			response = EmployeeVo.builder()
					.id(emp.getId())
					.name(emp.getName())
					.salary(emp.getSalary())
					.achievements(emp.getAchievements())
					.designation(emp.getDesignation())
					.currentWorkingProject(emp.getCurrentWorkingProject())
					.department(emp.getDepartment())
					.company(emp.getCompany())
					.reportingManager(emp.getReportingManager())
					.phoneNumber(emp.getPhoneNumber())
					.build();
			return response;

			
		}else {
			throw new Exception("Employee not found with given id");			
		}
		
	}
}
