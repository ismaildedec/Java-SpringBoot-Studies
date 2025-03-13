package com.ihsandedec.controller;

import java.util.List;

import com.ihsandedec.dto.DtoEmployee;

public interface IEmployeeController {
	
	public List<DtoEmployee> findAllEmployees();
}
