package com.qac.project_1.dao;

import com.qac.project_1.entity.ProRegDetail;

public interface RegisterDAO {
	
	public void save(ProRegDetail entity);
	
	public ProRegDetail checkbyemail(String email);
	
	

}
