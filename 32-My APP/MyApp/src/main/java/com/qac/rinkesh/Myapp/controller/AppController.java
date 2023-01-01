package com.qac.rinkesh.Myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qac.rinkesh.Myapp.dao.InformationDAO;
import com.qac.rinkesh.Myapp.dto.InformationDTO;
import com.qac.rinkesh.Myapp.dto.LoginDTO;
import com.qac.rinkesh.Myapp.entity.MyappRegDetails;
import com.qac.rinkesh.Myapp.services.CommanService;

@Controller
@RequestMapping("/")
public class AppController {
	

	/* @Autowired
	private InformationDAO dao;
	
	@RequestMapping(value = "/hello" , method = RequestMethod.POST)
	public String hello(InformationDTO information)
	{
		
		MyappRegDetails info= new MyappRegDetails();
		info.setEmail(information.getEmail());
		info.setPassword(information.getPassword());
		info.setContact(information.getNumber());
		
		dao.save(info);
		return"Home.jsp";*/
	
	
	
	
		@Autowired
		public CommanService service;
		
		@RequestMapping(value = "/signup" , method = RequestMethod.POST)
		public ModelAndView signup(InformationDTO information)
		{	
			String msg= service.validateAndSave(information);
			System.out.println(msg);
			
			ModelAndView modelAndView= new ModelAndView();
			modelAndView.addObject("responseMsg", msg);
			modelAndView.setViewName("Home.jsp");
			
			return modelAndView;
		}
	
		@RequestMapping(value = "/login" , method = RequestMethod.POST)
		public ModelAndView login(LoginDTO dto)
		{
			System.out.println(dto);
			
			String res=service.validateAndLogin(dto);
			System.out.println(res);
			
			ModelAndView modelAndView= new ModelAndView();
			modelAndView.addObject("responseMsg", res);
			if(res.endsWith("login Successfull"))
			{
				modelAndView.setViewName("Home.jsp");
			}
			else
			{
				modelAndView.setViewName("Login.jsp");
			}
			
			return modelAndView;
		}
	

}
