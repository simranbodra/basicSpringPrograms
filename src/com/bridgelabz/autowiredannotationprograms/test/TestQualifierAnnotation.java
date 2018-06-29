package com.bridgelabz.autowiredannotationprograms.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.autowiredannotationprograms.model.Pancard;
import com.bridgelabz.autowiredannotationprograms.model.QualifierEmployee;

public class TestQualifierAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Qualified.xml");
		QualifierEmployee employee = context.getBean("employee", QualifierEmployee.class);
		if(employee != null) {
			System.out.println("Id:- " + employee.getId());
			System.out.println("Name:- " + employee.getName());
			System.out.println("Email:- " + employee.getEmail());
			
			Pancard pancard = employee.getPancard();
			if(pancard != null) {
				System.out.println("Pancard Holder Name:-" + pancard.getPancardHolderName());
				System.out.println("Pancard Number:- " + pancard.getPancardNo());
			}
		}
	}

}
