package com.ihsandedec.service;

import com.ihsandedec.dto.DtoEmployee;

public interface IEmployeeService {

	public DtoEmployee findEmployeeById(Long id);
}
