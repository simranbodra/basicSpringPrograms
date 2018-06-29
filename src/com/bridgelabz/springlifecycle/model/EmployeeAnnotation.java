package com.bridgelabz.springlifecycle.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeeAnnotation {

	private int id;
	private String name;
	private String email;

	private Pancard pancard;

	EmployeeAnnotation() {
		System.out.println("Employee default constructor");
	}

	EmployeeAnnotation(int id, String name) {
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

	@PostConstruct
	public void init() throws Exception {
		System.out.println("Init method after properties are set ");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Spring Container is destroy! Employee clean up");
	}

}
