package com.ihsandedec.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihsandedec.controller.IHomeController;
import com.ihsandedec.dto.DtoHome;
import com.ihsandedec.services.IHomeService;

@RestController
@RequestMapping("/rest/api/home")
public class HomeControllerImpl implements IHomeController {
	@Autowired
	private IHomeService homeService;
	
	@GetMapping(path = "/list/{id}")
	@Override
	public DtoHome findHomeById(@PathVariable(name = "id") Long id) {
		
		return homeService.findHomeById(id);
	}

}
