package com.ihsandedec.controller;

import com.ihsandedec.dto.DtoHome;

public interface IHomeController {
	
	public DtoHome findHomeById(Long id);
}
