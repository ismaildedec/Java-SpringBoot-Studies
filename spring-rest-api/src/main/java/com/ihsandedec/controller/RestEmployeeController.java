package com.ihsandedec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihsandedec.model.Employee;
import com.ihsandedec.services.EmployeeService;

@RestController
@RequestMapping("/rest/api")
public class RestEmployeeController {
	//Postmandan istek atıldığında ilk karşılamayı yapar.
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path = "/employee-list")
	public List<Employee> getAllEmployeeList(){
		
		
		
		return employeeService.getAllEmployeeList();
	}

}
