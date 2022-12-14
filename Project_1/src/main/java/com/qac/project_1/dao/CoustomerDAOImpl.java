package com.qac.project_1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qac.project_1.entity.ProCustomerDetail;


@Repository
public class CoustomerDAOImpl  implements CustomerDAO{
	
	@Autowired
	private SessionFactory sessionfactory;
	
	public void save(ProCustomerDetail entity) {
		
		Session session =sessionfactory.openSession();
		session.save(entity);
		
		Transaction tr =session.beginTransaction();
		tr.commit();
		
		
		session.close();
		
	}
	

	public ProCustomerDetail checkbyemail(String email)
	{
		Session session =sessionfactory.openSession();
		
		String query="FROM ProCustomerDetail Where email='"+email +"'";
		Query qu = session.createQuery(query);
		
		 ProCustomerDetail entity = (ProCustomerDetail) qu.uniqueResult();
		 System.out.println(entity);
		 session.close();
		return entity;
		
	}
	
	public List<ProCustomerDetail> checkbystatuse(String statuse)
	{
		Session session =sessionfactory.openSession();
		
		String query2="FROM ProCustomerDetail Where statuse='"+statuse+"'";
		Query qu2 = session.createQuery(query2);
		
		 List<ProCustomerDetail> entity = qu2.getResultList();
		 System.out.println(entity);
		 session.close();
		return entity;

	}

	
	
}
