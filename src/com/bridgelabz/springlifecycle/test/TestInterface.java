package com.bridgelabz.springlifecycle.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.springlifecycle.model.EmployeeForInterface;
import com.bridgelabz.springlifecycle.model.Pancard;

public class TestInterface {

public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("Dependency.xml");
		Resource resource = new ClassPathResource("Lifecycle.xml");  
	    BeanFactory factory = new XmlBeanFactory(resource); 
		EmployeeForInterface employee = factory.getBean("employee", EmployeeForInterface.class);
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
		//((ConfigurableApplicationContext)context).close();
		((ConfigurableBeanFactory) factory).destroySingletons();
	}
}
