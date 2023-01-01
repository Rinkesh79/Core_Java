package com.qac.project_1.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qac.project_1.dto.CustomerDTO;

import com.qac.project_1.dto.ForgetPasswordDTO;
import com.qac.project_1.dto.RegisterDTO;
import com.qac.project_1.entity.ProCustomerDetail;
import com.qac.project_1.entity.ProRegDetail;
import com.qac.project_1.services.CommanServices;

@Controller
@RequestMapping("/")
public class Procontroler {
	
	@Autowired
	private CommanServices service;
	
	@RequestMapping(value ="/signup" , method = RequestMethod.POST)
	public ModelAndView save(RegisterDTO dto)
	{
		String msg =service.validateAndSave(dto);
		System.out.println(msg);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("msg",msg);
		modelAndView.setViewName("/Register.jsp");
		
		return modelAndView;
		
	}

	@RequestMapping(value ="/login" , method = RequestMethod.POST)
	public ModelAndView login(RegisterDTO dto)
	{
		ModelAndView modelAndView=new ModelAndView();
		System.out.println(dto);
		String msg= service.validateAndLogin(dto);
		System.out.println(msg);
		
		modelAndView.addObject("msg",msg);

		if(dto.getProfile().equals("customer") && msg.contains(".com"))
		{
			modelAndView.setViewName("/CustomerHome.jsp");
		}
		else if (dto.getProfile().equals("Employe")) 
		{
			modelAndView.setViewName("/Employe.jsp");
		} 
		else if (dto.getProfile().equals("admin"))
		{
			
			modelAndView.setViewName("/Admin.jsp");
		}
		else
		{
			modelAndView.setViewName("/Login.jsp");
		}
		return modelAndView;
	}
	
	@RequestMapping(value ="/OTP" , method = RequestMethod.POST)
	public ModelAndView sendOtp(String email)
	{
		System.out.println(email);
		String msg= service.validateAndSentOtp(email);
		
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.addObject("msg",msg);
		modelAndView.setViewName("/ForgetPassword.jsp");
		
		return modelAndView;
	}

	@RequestMapping(value ="/customernewticket" , method = RequestMethod.POST)
	public ModelAndView Customerdatasave(CustomerDTO cdto)
	{

		String msg =service.customervalidateAndSave(cdto);
		System.out.println(msg);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("msg",msg);
		modelAndView.setViewName("/CustomerNewTicket.jsp");
		
		return modelAndView;
	}

	@RequestMapping(value ="/getprofile/{id}" , method = RequestMethod.GET)
	public ModelAndView getprofile(@PathVariable("id") String id)
	{
		System.out.println(id);
		ProRegDetail msg= service.getprofile(id);
		System.out.println(msg);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("details",msg);
		modelAndView.setViewName("/CustomerHome.jsp");
		
		return modelAndView;
	}
	
	
	
	@RequestMapping(value="/forgrtpassword" , method= RequestMethod.POST)
	public ModelAndView forgetpPassword(ForgetPasswordDTO fdto)
	{
		String msg = service.validateAndUpdatePassword(fdto);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("msg",msg);
		
		if("Password Updated".equals(msg))
		{
		modelAndView.setViewName("/Login.jsp");
		}
		else
		{
			modelAndView.setViewName("/ForgetPassword.jsp");
		}
		return modelAndView;
	}

	
	@RequestMapping(value ="/getallticket" , method = RequestMethod.POST)
	public ModelAndView getallticket(String email)
	{

		ProCustomerDetail msg =service.getallticket(email);
		System.out.println(msg);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("msg",msg);
		modelAndView.setViewName("/GetAllTicket.jsp");
		
		return modelAndView;
	}
	
	
	@RequestMapping(value="/getallopenticket" , method = RequestMethod.POST)
	public ModelAndView openticket(String statuse)
	{
		System.out.println(statuse);
		
		List <ProCustomerDetail> msg= service.getopentickets(statuse);
		System.out.println(msg);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("msg",msg);
		modelAndView.setViewName("/Admin.jsp");
		
		return modelAndView;
	}
}
