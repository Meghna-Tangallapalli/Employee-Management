package com.emptask.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emptask.api.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Long>{

}
