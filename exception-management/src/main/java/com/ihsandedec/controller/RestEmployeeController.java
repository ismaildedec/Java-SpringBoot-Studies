package com.ihsandedec.controller;

import com.ihsandedec.dto.DtoEmployee;

public interface RestEmployeeController {
	
	public DtoEmployee findEmployeeById(Long id);

}
