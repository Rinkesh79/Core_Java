package com.qac.rinkesh.Myapp.dao;

import com.qac.rinkesh.Myapp.entity.MyappRegDetails;

public interface InformationDAO {

	public void save(MyappRegDetails information);
	
	public MyappRegDetails getByEmail(String email);
}
