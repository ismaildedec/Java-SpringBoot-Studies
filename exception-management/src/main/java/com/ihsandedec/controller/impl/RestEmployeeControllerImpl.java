package com.ihsandedec.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihsandedec.controller.RestEmployeeController;
import com.ihsandedec.dto.DtoEmployee;
import com.ihsandedec.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/employee")
public class RestEmployeeControllerImpl implements	RestEmployeeController{
	
	@Autowired
	private EmployeeServiceImpl employeeService; 	
	
	@GetMapping("/list/{id}")
	@Override
	public DtoEmployee findEmployeeById(@PathVariable(value = "id") Long id) {
		
		return employeeService.findEmployeeById(id);
	}

}
