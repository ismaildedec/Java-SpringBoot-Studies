package com.ihsandedec.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihsandedec.controller.IEmployeeController;
import com.ihsandedec.dto.DtoEmployee;
import com.ihsandedec.services.IEmployeeService;


@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping(path = "/list")
	@Override
	public List<DtoEmployee> findAllEmployees() {
		
		return employeeService.findAllEmployees();
	}

}
