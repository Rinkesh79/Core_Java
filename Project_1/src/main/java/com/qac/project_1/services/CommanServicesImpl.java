package com.qac.project_1.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qac.project_1.dao.CustomerDAO;
import com.qac.project_1.dao.RegisterDAO;
import com.qac.project_1.dto.CustomerDTO;
import com.qac.project_1.dto.ForgetPasswordDTO;
import com.qac.project_1.dto.RegisterDTO;
import com.qac.project_1.entity.ProCustomerDetail;
import com.qac.project_1.entity.ProRegDetail;
import com.qac.project_1.util.MyProUtil;

@Service
public class CommanServicesImpl implements CommanServices{

	@Autowired
	private RegisterDAO dao;
	
	@Autowired
	private CustomerDAO cdao;
	

	
	@Autowired
	private MyProUtil util;
	
	
	public String validateAndSave(RegisterDTO dto)
	{
		

		ProRegDetail entity= dao.checkbyemail(dto.getEmail());
		
		if(entity != null && dto.getEmail().equals(entity.getEmail()))
		{
			
			return "Email already Register Use Differt Email";
		}
		else
		{		
		
				
		if(dto.getFirstname() != null && !dto.getFirstname().isEmpty())
		{
			if(dto.getSurename() !=null && !dto.getSurename().isEmpty())
			{
				
				if(dto.getEmail() !=null && !dto.getEmail().isEmpty()) 
				{
					if(dto.getPassword() !=null && !dto.getPassword().isEmpty())
					{
						if(dto.getCnfpassword() !=null && !dto.getCnfpassword().isEmpty() && dto.getCnfpassword().equals(dto.getPassword()))
						{
							if(dto.getDob() !=null && !dto.getDob().isEmpty())
							{
								if(dto.getContact() !=null && !dto.getContact().isEmpty())
								{
									if(dto.getCity() !=null && !dto.getCity().isEmpty())
									{
										if(dto.getState() !=null && !dto.getState().isEmpty())
										{
											if(dto.getCountry() !=null && !dto.getState().isEmpty())
											{
												if(dto.getPincod() !=null && !dto.getPincod().isEmpty())
												{
													if(dto.getProfile() !=null && !dto.getProfile().isEmpty())
													{
													ProRegDetail data=new ProRegDetail();
													data.setFirstname(dto.getFirstname());
													data.setSurename(dto.getSurename());
													data.setEmail(dto.getEmail());
													data.setPassword(dto.getPassword());
													data.setDob(dto.getDob());
													data.setContact(dto.getContact());
													data.setCity(dto.getCity());
													data.setState(dto.getState());
													data.setCountry(dto.getCountry());
													data.setPincod(dto.getPincod());
													data.setProfile(dto.getProfile());
													dao.save(data);
													return "Data Saved";
													}
													else {
														return "select profile";
													}
												}
												else {
													return "enter Valid Pincoad";
												}
											}
											else {
												return "enter Valid Country";
											}
										}
										else {
											return "enter Valid State";
										}
									}
									else {
										return "enter Valid City";
									}
								}
								else {
									return "enter Valid Contact";
								}
							}
							else {
								return "enter Valid DOB";
							}
								
						}
						else {
							return "enter Valid Confirmpassword";
						}
					}
					else {
						return "enter Valid password";
					}
				}
				else {
					return "enter Valid Email";
				}
			}
			else{
				return "enter Valid Surename name";
			}
		}
		else {
			return "enter Valid First name";
		}
	
	}
	
}	
	
	
			public String validateAndLogin(RegisterDTO dto)
			{

				if(dto.getEmail() !=null && !dto.getEmail().isEmpty()) 
				{
					
					if(dto.getPassword() !=null && !dto.getPassword().isEmpty())
					{
						ProRegDetail entity= dao.checkbyemail(dto.getEmail());
						
						if(entity != null && dto.getEmail().equals(entity.getEmail()) && dto.getPassword().equals(entity.getPassword()) && dto.getProfile().equals(entity.getProfile()))
						{
							
							return dto.getEmail();
						}
						else
						{
							return "enter Valid Email & password";
						}
					}
					else {
						return "enter Valid password";
					}
				}
				else {
					return "enter Valid Email";
				}
				
				
			}




			public String validateAndSentOtp(String email) {
				
				if(email !=null && !email.isEmpty()) 
				{
					ProRegDetail entity= dao.checkbyemail(email);
					if (entity != null)
					{
			
						int otp=util.generateotp();
						util.sendMsg(email, otp);
						
						entity.setOtp(otp);
						dao.save(entity);
						return "otp sent";
					}
					else {
						return "enter Valid Email";
					}
					
				}
				
			else {
				return "enter Valid Email";
				}
				
			}
			
			
			public String customervalidateAndSave(CustomerDTO cdto)
			{
				
				if(cdto.getEmail() !=null && !cdto.getEmail().isEmpty()) 
				{
					if(cdto.getModel() !=null && !cdto.getModel().isEmpty())
					{
						if(cdto.getIssue() !=null && !cdto.getIssue().isEmpty())
						{
							ProCustomerDetail data= new ProCustomerDetail();
							data.setEmail(cdto.getEmail());
							data.setModel(cdto.getModel());
							data.setIssue(cdto.getIssue());
							data.setStatuse("open");
							data.setCreationdate("LocalDateTime.now()");
							cdao.save(data);
							return "Ticket Created";
						}
						else
						{
							return "enter valid Issue";
						}
					}
					else
					{
						return "enter valid Model";
					}
				}
				else 
				{
					return "enter valid email";
				}
				
				
			}
			
			
			
			
			
			public ProRegDetail getprofile(String email)
			{
				ProRegDetail entity=null;
				if(email !=null && !email.isEmpty())
				{
					entity= dao.checkbyemail(email);
				
				}
				return entity;
					
				
			}
			
			
			
			public ProCustomerDetail  getallticket(String email)
			{
				ProCustomerDetail cdetails=null;
				if(email !=null && !email.isEmpty())
				{
					cdetails= cdao.checkbyemail(email);
					
				}
				
				
				
				return cdetails;				
								
			}




			
			public String validateAndUpdatePassword(ForgetPasswordDTO fdto) {
				
				if(fdto.getEmail()!=null && !fdto.getEmail().isEmpty())
				{
					ProRegDetail customer= dao.checkbyemail(fdto.getEmail());
					
					if(fdto.getOtp() == customer.getOtp())
					{
						
						if(fdto.getPassword() !=null && !fdto.getPassword().isEmpty())
						{
							if(fdto.getCrfpassword() !=null && !fdto.getCrfpassword().isEmpty() && fdto.getPassword().equals(fdto.getCrfpassword())) 
							{
								customer.setPassword(fdto.getPassword());
								customer.setOtp(0);
								dao.save(customer);
								return "Password Updated";
							}
							else
							{
								return "enter valid cnf-Password";
							}
						}
						else
						{
							return "enter valid Password ";
						}
					}
					else
					{
						return "enter valid OTP";
					}
				}
				else
				{
					return "enter valid Email";
				}
				
			}
			
			
			public List<ProCustomerDetail> getopentickets(String statuse)
			{
				
				List<ProCustomerDetail> entity=(List<ProCustomerDetail>) cdao.checkbystatuse(statuse);
				System.out.println(entity);
				return entity;
			}
			
			
			
			
	
}
