package com.ihsandedec.services.impl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihsandedec.dto.DtoDepartment;
import com.ihsandedec.dto.DtoEmployee;
import com.ihsandedec.entites.Employee;
import com.ihsandedec.repository.IEmployeeRepository;
import com.ihsandedec.services.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository employeeRepository;

	@Override
	public List<DtoEmployee> findAllEmployees() {
		List<DtoEmployee> dtoEmployeeList = new ArrayList<>();

		List<Employee> dbEmployees = employeeRepository.findAll();
		if (dbEmployees != null && !dbEmployees.isEmpty()) {
			for (Employee employee : dbEmployees) {
				DtoEmployee dtoEmployee = new DtoEmployee();
				BeanUtils.copyProperties(employee, dtoEmployee);

				dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),
						employee.getDepartment().getDepartmentName()));

				dtoEmployeeList.add(dtoEmployee);
			}
		}
		return dtoEmployeeList;
	}

}
