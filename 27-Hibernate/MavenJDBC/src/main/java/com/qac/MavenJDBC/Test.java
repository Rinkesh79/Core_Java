package com.qac.MavenJDBC;

import com.qac.MavenJDBC.dao.InformationDAO;
import com.qac.MavenJDBC.entity.Information;

public class Test {

	
	public static void main(String[] args) {
		
		InformationDAO dao=new InformationDAO();
		dao.getall();
		
		Information info=new Information();
		info.setId(3);
		info.setName("rahul");
		info.setEmail("rahul@gmail.com");
		
		//dao.save(info);
		
	//	dao.delete(3);
		
		dao.update("rinkesh123@yahoo.com", 1);
	
	}
	
	
}
