package com.ihsandedec.services;

import com.ihsandedec.dto.DtoHome;

public interface IHomeService {

	public DtoHome findHomeById(Long id);
}
