package com.ihsandedec.services;

import java.util.List;

import com.ihsandedec.dto.DtoEmployee;

public interface IEmployeeService {
	
	public List<DtoEmployee> findAllEmployees();
}
