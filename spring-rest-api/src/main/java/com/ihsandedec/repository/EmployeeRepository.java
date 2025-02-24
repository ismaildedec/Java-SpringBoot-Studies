package com.ihsandedec.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ihsandedec.model.Employee;

@Repository
public class EmployeeRepository {
	@Autowired
	private List<Employee> employeeList;
	
	public List<Employee> getAllEmployeeList(){
		
		
		return employeeList;
	} 
}
