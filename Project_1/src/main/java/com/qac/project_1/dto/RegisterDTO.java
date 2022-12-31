package com.qac.project_1.dto;

public class RegisterDTO {
	
	private String firstname;
	private String surename;
	private String email;
	private String password;
	private String cnfpassword;
	private String dob;
	private String contact;
	private String city;
	private String state;
	private String country;
	private String pincod;
	private String profile;
	
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurename() {
		return surename;
	}
	public void setSurename(String surename) {
		this.surename = surename;
	}
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincod() {
		return pincod;
	}
	public void setPincod(String pincod) {
		this.pincod = pincod;
	}

	public String getCnfpassword() {
		return cnfpassword;
	}

	public void setCnfpassword(String cnfpassword) {
		this.cnfpassword = cnfpassword;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "RegisterDTO [firstname=" + firstname + ", surename=" + surename + ", email=" + email + ", password="
				+ password + ", cnfpassword=" + cnfpassword + ", dob=" + dob + ", contact=" + contact + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pincod=" + pincod + ", profile=" + profile + "]";
	}
	
	
	

	
	
	

}

