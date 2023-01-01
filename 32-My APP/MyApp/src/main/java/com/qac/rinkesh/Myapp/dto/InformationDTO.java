package com.qac.rinkesh.Myapp.dto;

public class InformationDTO {
	
	private String email;
	private String password;
	private String cnfpassword;
	private String number;
	
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCnfpassword() {
		return cnfpassword;
	}
	public void setCnfpassword(String cnfpassword) {
		this.cnfpassword = cnfpassword;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Information [email=" + email + ", password=" + password + ", cnfpassword=" + cnfpassword
				+ ", number=" + number + "]";
	}
	
	
	

}
