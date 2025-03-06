package com.ihsandedec.services;

import com.ihsandedec.dto.DtoCustomer;

public interface ICustomerService {
	
	public DtoCustomer findCustomerById(Long id);
}
