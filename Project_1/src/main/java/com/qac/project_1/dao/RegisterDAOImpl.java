package com.qac.project_1.dao;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qac.project_1.entity.ProRegDetail;


@Repository
public class RegisterDAOImpl implements RegisterDAO {
	
	@Autowired
	private SessionFactory sessionfactory;
	
	 public void save(ProRegDetail entity )
	 {
		 Session sessions = sessionfactory.openSession();
		 
		 sessions.saveOrUpdate(entity);
		 
		 Transaction tr=sessions.beginTransaction();
		 tr.commit();
		 
		 sessions.close();
	 }
	
	public ProRegDetail checkbyemail(String email)
	{
		
		Session sessions = sessionfactory.openSession();
		String query="FROM ProRegDetail where email='"+email+"'";
		Query que=sessions.createQuery(query);
		
			
			ProRegDetail entity= (ProRegDetail) que.uniqueResult();
			System.out.println(entity);
			sessions.close();
		 
			return entity;
	}

}
