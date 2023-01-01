package com.qac.rinkesh.Myapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.qac.rinkesh.Myapp.dao.InformationDAO;
import com.qac.rinkesh.Myapp.dto.InformationDTO;
import com.qac.rinkesh.Myapp.dto.LoginDTO;
import com.qac.rinkesh.Myapp.entity.MyappRegDetails;


@Service
public class CommanService implements CommanServiceImpl{
	
	@Autowired
	private InformationDAO dao;


	public String validateAndSave(InformationDTO information) {
		
		if(information.getEmail() != null && !information.getEmail().isEmpty())
		{
			if(information.getPassword() !=null && !information.getPassword().isEmpty())
			{
				if(information.getCnfpassword() !=null && !information.getCnfpassword().isEmpty() && !information.getCnfpassword().isEmpty() && information.getPassword().equals(information.getCnfpassword() ))
				{
					if(information.getNumber() !=null)
					{
						MyappRegDetails reg=new MyappRegDetails();
						reg.setEmail(information.getEmail());
						reg.setPassword(information.getPassword());
						reg.setContact(information.getNumber());
						
						dao.save(reg);
						return "Data save";
					}
					else
					{
						return "Invalid Contact number";
					}
				}
				else 
				{
					return "invalid confiorm password";
				}
			}
			else
			{
				return "Invalid Password";
			}
		}
		else
		{
			return "Invalid Email ID";
		}
		
		
	}



	public String validateAndLogin(LoginDTO dto) {
		
		if(dto.getEmail() != null && !dto.getEmail().isEmpty())
		{
			if(dto.getPassword() !=null && !dto.getPassword().isEmpty())
			{
				
				MyappRegDetails regdetail = dao.getByEmail(dto.getEmail());
				
				if(dto.getEmail().equals(regdetail.getEmail()) && dto.getPassword().equals(regdetail.getPassword()))
				{
					return "login Successfull";
				}
				else
				{
					return "Invalid Email and Password";
				}
				
			}
			else
			{
				return "Invalid Password";
			}
		
		}
		else
		{
			return "Invalid Email ID";
		}
		
	}
	
	
	
	
	
	

}
