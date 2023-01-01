package com.qac.project_1.dao;

import java.util.List;

import com.qac.project_1.entity.ProCustomerDetail;


public interface CustomerDAO {
	
	public void save(ProCustomerDetail entity);
	
	public ProCustomerDetail checkbyemail(String email);

	public List<ProCustomerDetail> checkbystatuse(String statuse);
}
