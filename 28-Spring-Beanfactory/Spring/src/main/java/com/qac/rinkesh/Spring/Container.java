package com.qac.rinkesh.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.qac.rinkesh.Spring.dto.Informationdto;

public class Container {

	
	public static void main(String[] args) {
		
		//Beanfactory
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Informationdto informationdto= (Informationdto) factory.getBean("information1");
		System.out.println(informationdto);
		
		
		
		
	}
	
}
