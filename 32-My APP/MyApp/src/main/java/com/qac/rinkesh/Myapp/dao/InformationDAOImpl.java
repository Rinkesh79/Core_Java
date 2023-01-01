package com.qac.rinkesh.Myapp.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.qac.rinkesh.Myapp.entity.MyappRegDetails;

@Repository
public class InformationDAOImpl implements InformationDAO 
{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	public void save(MyappRegDetails information)
	{
		
		Session session =sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(information);
		tr.commit();
		session.clear();
		
	}
	
	
	public MyappRegDetails getByEmail(String email)
	{
		Session session =sessionFactory.openSession();
		String query="FROM MyappRegDetails where email='"+email+"'";
		Query qa=session.createQuery(query);
		
	    MyappRegDetails entity= (MyappRegDetails) qa.getSingleResult();
		System.out.println(entity);
		return entity;
	}
	
}
