package com.qac.project_1.dto;




public class CustomerDTO {
	
	
	private String email;
	private String model;
	private String issue;
	private String creationdate;
	private String modificationdate;
	private String statuse;
	private String asignee;
	
	
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
		return "CustomerDTO [email=" + email + ", model=" + model + ", issue=" + issue + ", creationdate="
				+ creationdate + ", modificationdate=" + modificationdate + ", statuse=" + statuse + ", asignee="
				+ asignee + "]";
	}
	
	
	
	
	
}
