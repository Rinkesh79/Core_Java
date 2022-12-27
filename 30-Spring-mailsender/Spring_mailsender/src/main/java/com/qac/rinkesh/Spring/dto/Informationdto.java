package com.qac.rinkesh.Spring.dto;



public class Informationdto {
	
	private int id;
	private String name;
	private String email;
	
	
	
	public Informationdto(int id ,String name,String email )
	{
		System.out.println("constructor inj");
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String toString() {
		return "information [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	

	

}
