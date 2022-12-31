package com.qac.project_1.dto;




public class ForgetPasswordDTO {
	
	private String email;
	private int otp;
	private String password;
	private String crfpassword;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCrfpassword() {
		return crfpassword;
	}
	public void setCrfpassword(String crfpassword) {
		this.crfpassword = crfpassword;
	}
	@Override
	public String toString() {
		return "ForgetPasswordDTO [email=" + email + ", otp=" + otp + ", password=" + password + ", crfpassword="
				+ crfpassword + "]";
	}
	

	
	
	

}
