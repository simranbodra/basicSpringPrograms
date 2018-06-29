package com.bridgelabz.springlifecycle.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeForInterface implements InitializingBean, DisposableBean{

	private int id;
	private String name;
	private String email;
	
	private Pancard pancard;
	
	EmployeeForInterface(){
		System.out.println("Employee default constructor");
	}

	EmployeeForInterface(int id, String name, String email){
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
	
	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean is destroyed...");		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialzing after properties are set..");		
	}
	
}
