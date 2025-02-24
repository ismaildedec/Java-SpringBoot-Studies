package com.ihsandedec.repository;


import java.util.ArrayList;
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
	
	public Employee getEmployeeById(String id ) {
		
		Employee findEmployee = null ;
		
		for (Employee employee : employeeList) {
			
			if (id.equals(employee.getId())) {
				
				findEmployee = employee;
				break;
			}
		
		}
		return findEmployee;
	}
	
	public List<Employee> getEmployeeWithParams(String firstName , String lastName){
		List< Employee > employeWithParams = new ArrayList<>();
		
		if (firstName == null && lastName == null) {
			return employeeList;
		}
		
		for (Employee employee : employeeList) {
			if(firstName != null && lastName != null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName) && employee.getLastName().equalsIgnoreCase(lastName)) {
					employeWithParams.add(employee);
				}
			}
			if(firstName == null && lastName != null) {
				if ( employee.getLastName().equalsIgnoreCase(lastName)) {
					employeWithParams.add(employee);
				}
			}
			if(firstName != null && lastName == null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName) ) {
					employeWithParams.add(employee);
				}
			}
		}
		
		return employeWithParams;
	}
	
	public Employee saveEmployee(Employee newEmployee) {
		
		employeeList.add(newEmployee);
		return newEmployee;
	}
}
