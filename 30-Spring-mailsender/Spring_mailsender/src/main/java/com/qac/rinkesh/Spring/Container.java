package com.qac.rinkesh.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.qac.rinkesh.Spring.dto.Informationdto;
import com.qac.rinkesh.Spring.util.MyMailSender;

public class Container {

	
	public static void main(String[] args) {
		
		
		
		Resource r=new ClassPathResource("applicationContext.xml");  
		BeanFactory b=new XmlBeanFactory(r);  
		MyMailSender m=(MyMailSender)b.getBean("MyMailSender");  
		String sender="rathodmeet70@gmail.com";
		String receiver="rinkeshpatel.rp@gmail.com"; 
		m.sendMail(sender,receiver,"hi","welcome this mail is send by java mailsender for project perpose only ");  
		      
		System.out.println("success");  
		
		
	}
	
}
