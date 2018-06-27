package com.bridgelabz.autowirebytype.model;

public class Employee {
	private int id;
	private String name;
	private String email;
	
	private Pancard pancard;
	
	Employee(){
		System.out.println("Employee default constructor");
	}

	Employee(int id, String name){
		this.id = id;
		this.name = name;
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
	
	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	
}
