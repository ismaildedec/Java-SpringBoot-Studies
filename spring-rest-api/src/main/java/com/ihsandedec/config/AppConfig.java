package com.ihsandedec.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ihsandedec.model.Employee;

@Configuration
public class AppConfig {

	@Bean
	public List<Employee> employeeList(){
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1,"İhsan","Dedeç"));
		employeeList.add(new Employee(2,"İsmail","Dedeç"));
		employeeList.add(new Employee(3,"Asaf","Dedeç"));
		employeeList.add(new Employee(4,"Ali","Dedeç"));
		
		return employeeList;
	}
}
