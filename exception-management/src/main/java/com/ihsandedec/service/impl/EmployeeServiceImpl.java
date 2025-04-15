package com.ihsandedec.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihsandedec.dto.DtoDepartment;
import com.ihsandedec.dto.DtoEmployee;
import com.ihsandedec.exception.BaseException;
import com.ihsandedec.exception.ErrorMessage;
import com.ihsandedec.exception.MessageType;
import com.ihsandedec.model.Department;
import com.ihsandedec.model.Employee;
import com.ihsandedec.repository.EmployeeRepository;
import com.ihsandedec.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public DtoEmployee findEmployeeById(Long id) {
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if (optional.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
			
		}
		
		Employee employee = optional.get();
		Department department = employee.getDepartment();
		
		BeanUtils.copyProperties(employee, dtoEmployee);
		BeanUtils.copyProperties(department, dtoDepartment);
		
		dtoEmployee.setDepartment(dtoDepartment);
		return dtoEmployee;
	}
	
	

}
