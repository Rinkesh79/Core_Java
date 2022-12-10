package com.qac.MavenJDBC.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.qac.MavenJDBC.entity.Information;

public class InformationDAO {
	
	SessionFactory factory=null;
	
	public InformationDAO() 
	{
		Configuration config=new Configuration();
		config.configure();
		
		factory = config.buildSessionFactory();
	}
	
	
	
	public void getall()
	{
	   		
		Session session= factory.openSession();
		
		Information info= session.get(Information.class, 1);
		System.out.println(info);
		
		session.close();
	}
	
	public void save(Information info)
	{
		
		Session session= factory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(info);
		tr.commit();
		System.out.println("Data Save");
		session.close();
		
	}
	
	public void delete(int id)
	{
		Session session= factory.openSession();
		Transaction tr=session.beginTransaction();
		
		Information info= session.get(Information.class, id);
		
		session.delete(info);
		
		tr.commit();
		System.out.println("Data Deleted");
		session.close();
		
		
	}
	
	public void update(String email,int id)
	{
		
		Session session= factory.openSession();
		Transaction tr=session.beginTransaction();
		
		Information info =session.get(Information.class, id);
		info.setEmail(email);
		
		
		tr.commit();
		System.out.println("Data Update");
		session.close();
		
		
	}
	

}
