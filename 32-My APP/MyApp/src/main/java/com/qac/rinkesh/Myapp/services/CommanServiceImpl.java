package com.qac.rinkesh.Myapp.services;

import com.qac.rinkesh.Myapp.dto.InformationDTO;
import com.qac.rinkesh.Myapp.dto.LoginDTO;

public interface CommanServiceImpl {
	
	public String validateAndSave(InformationDTO information);
	
	public String validateAndLogin(LoginDTO login);
	
}
