package com.qac.rinkesh.springhibernate;

import javax.sql.DataSource;


import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.qac.rinkesh.springhibernate.entity.Information;

public class Test {

	
	public static void main(String[] args) {
		
		
		ApplicationContext container =new ClassPathXmlApplicationContext("applicationContext.xml");	
		
		SessionFactory factory= (SessionFactory) container.getBean("factory");
		Session session= factory.openSession();
		
		Information information= session.get(Information.class,2);
		System.out.println(information);
		
	}
}
