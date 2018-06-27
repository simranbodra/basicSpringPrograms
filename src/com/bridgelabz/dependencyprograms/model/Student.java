package com.bridgelabz.dependencyprograms.model;

public class Student {

	private String name;  
	private int id;
	
	Student(){
		System.out.println("Default Constructor");
	}
	
	Student(String name, int id){
		this.name = name;
		this.id = id;
		System.out.println("Parameterized constructor");
	}
	  
	public String getName() {  
	    return name;  
	}  
	  
	public void setName(String name) {  
		System.out.println("Name setter called");
	    this.name = name;  
	}  
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Id setter called");
		this.id = id;
	}  
	
	public void displayInfo(){  
	    System.out.println("Hello: "+name);
	    System.out.println("Id: "+id);
	}
	
	public void display(String name, int id) {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
	}
}
