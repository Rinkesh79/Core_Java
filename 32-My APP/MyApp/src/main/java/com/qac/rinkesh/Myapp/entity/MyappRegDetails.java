package com.qac.rinkesh.Myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "myapp_reg_details")
public class MyappRegDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id") 
	private int id;
	
	@Column (name="email") 
	private String email;
	
	@Column (name="password") 
	private String password;
	
	@Column (name="contact") 
	private String contact;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "MyappRegDetails [id=" + id + ", email=" + email + ", password=" + password + ", contact=" + contact
				+ "]";
	}

	
	
	
	
}


