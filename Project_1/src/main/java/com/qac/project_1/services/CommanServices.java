package com.qac.project_1.services;

import com.qac.project_1.dto.CustomerDTO;
import com.qac.project_1.dto.ForgetPasswordDTO;
import com.qac.project_1.dto.RegisterDTO;
import com.qac.project_1.entity.ProCustomerDetail;
import com.qac.project_1.entity.ProRegDetail;

public interface CommanServices {

	public String validateAndSave(RegisterDTO dto);
	
	public String validateAndLogin(RegisterDTO dto);
	
	public String validateAndSentOtp(String email);

	public String customervalidateAndSave(CustomerDTO cdto);
	
	public ProRegDetail getprofile(String email);
	
	public ProCustomerDetail  getallticket(String email);
	
	public String validateAndUpdatePassword(ForgetPasswordDTO fdto);
}
