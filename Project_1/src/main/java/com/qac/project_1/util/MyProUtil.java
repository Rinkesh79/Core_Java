package com.qac.project_1.util;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class MyProUtil {
	
	@Autowired
	private JavaMailSender mailsender;
	
	public int generateotp()
	{
		Random random=new Random();
		//int otp=random.nextInt(9999);
		String otp=String.format("%04d", random.nextInt(9999));
		System.out.println(otp);
		
		return Integer.parseInt(otp);
		
	}

	public void sendMsg(String toemail,int otp) {
		SimpleMailMessage mailmsg=new SimpleMailMessage();
		mailmsg.setTo(toemail);
		mailmsg.setFrom("rathodmeet70@gmail.com");
		mailmsg.setSubject("OTP For MY Project Reset Password");
		mailmsg.setText("your OTP is"+otp);
		
		
		mailsender.send(mailmsg);
	}
}
