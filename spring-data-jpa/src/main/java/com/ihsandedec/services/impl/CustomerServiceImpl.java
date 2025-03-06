package com.ihsandedec.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihsandedec.dto.DtoAddress;
import com.ihsandedec.dto.DtoCustomer;
import com.ihsandedec.entites.Address;
import com.ihsandedec.entites.Customer;
import com.ihsandedec.repository.ICustomerRepository;
import com.ihsandedec.services.ICustomerService;

@Service
public class CustomerServiceImpl  implements ICustomerService{
	
	@Autowired
	private ICustomerRepository customerRepository ;

	@Override
	public DtoCustomer findCustomerById(Long id) {
		DtoCustomer dtoCustomer = new DtoCustomer();
		DtoAddress dtoAddress = new DtoAddress();
		
		Optional<Customer> optional =  customerRepository.findById(id);
		
		if (optional.isEmpty()) {
			return null;
		}else {
			
			Customer customer =  optional.get();
			Address address = optional.get().getAddress();
			
			BeanUtils.copyProperties(customer, dtoCustomer);
			BeanUtils.copyProperties(address, dtoAddress);
			
			dtoCustomer.setAddress(dtoAddress);
			return dtoCustomer;
		}
	
	}
}
