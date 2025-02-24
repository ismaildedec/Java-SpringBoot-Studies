package com.ihsandedec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihsandedec.model.Employee;
import com.ihsandedec.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployeeList(){
		
		
		return employeeRepository.getAllEmployeeList();
	} 
	
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
				
	}
}
