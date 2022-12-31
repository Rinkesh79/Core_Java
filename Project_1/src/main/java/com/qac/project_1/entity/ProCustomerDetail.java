package com.qac.project_1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pro1_customer_details")
public class ProCustomerDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="model")
	private String model;
	
	@Column(name="issue")
	private String issue;
	
	@Column(name="creationdate")
	private String creationdate;
	
	@Column(name="modificationdate")
	private String modificationdate;
	
	@Column(name="statuse")
	private String statuse;
	
	@Column(name="asignee")
	private String asignee;
	
	
	
	
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}
	public String getModificationdate() {
		return modificationdate;
	}
	public void setModificationdate(String modificationdate) {
		this.modificationdate = modificationdate;
	}
	public String getStatuse() {
		return statuse;
	}
	public void setStatuse(String statuse) {
		this.statuse = statuse;
	}
	public String getAsignee() {
		return asignee;
	}
	public void setAsignee(String asignee) {
		this.asignee = asignee;
	}
	@Override
	public String toString() {
		return "ProCustomerDetail [id=" + id + ", email=" + email + ", model=" + model + ", issue=" + issue
				+ ", creationdate=" + creationdate + ", modificationdate=" + modificationdate + ", statuse=" + statuse
				+ ", asignee=" + asignee + "]";
	}
	
	
	
	
	
	
	

}
