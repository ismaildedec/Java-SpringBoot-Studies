package com.ihsandedec.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihsandedec.configuration.DataSource;
import com.ihsandedec.configuration.GlobalProperties;

@RestController
@RequestMapping("rest/api")
public class PropertySourceController {
	
	@Autowired
	private GlobalProperties globalProperties;
	
	@GetMapping(path = "/datasource")
	public DataSource getDataSource() {
		
		DataSource dataSource = new DataSource();
		
		dataSource.setUrl(globalProperties.getUrl());
		dataSource.setUserName(globalProperties.getUserName());
		dataSource.setPassword(globalProperties.getPassword());
		
		return dataSource;
	}
}
