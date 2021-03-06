package com.bridgelabz.dependencyprograms.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.dependencyprograms.model.Employee;
import com.bridgelabz.dependencyprograms.model.Pancard;

public class AutowireByNameTest {
		
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Dependency.xml");
		Employee employee = ctx.getBean("employee", Employee.class);
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
