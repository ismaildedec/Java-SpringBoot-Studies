package com.ihsandedec.controller;

import com.ihsandedec.dto.DtoCustomer;

public interface ICustomerController {
	
	DtoCustomer findCustomerById(Long id);
}
