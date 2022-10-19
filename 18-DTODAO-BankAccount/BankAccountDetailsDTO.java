package com.qac.CoreJava.DTODAO;

public class BankAccountDetailsDTO {
	
	private String name;
	private int accountno; 
	private int contac;
	private String iFSC;
	private String emailid;
	private String type;
	
	
	public BankAccountDetailsDTO()
	{
		System.out.println("DTO const");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAccountno() {
		return accountno;
	}
	
	public int getContac() {
		return contac;
	}
	
	public String getiFSC() {
		return iFSC;
	}
	
	public String getEmailid() {
		return emailid;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	
	public void setContac(int contac) {
		this.contac = contac;
	}
	
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
		
	
}
