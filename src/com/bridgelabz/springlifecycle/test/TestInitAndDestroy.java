package com.bridgelabz.springlifecycle.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.springlifecycle.model.Employee;
import com.bridgelabz.springlifecycle.model.Pancard;

public class TestInitAndDestroy {

public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("Dependency.xml");
		Resource resource = new ClassPathResource("Dependency.xml");  
	    BeanFactory factory = new XmlBeanFactory(resource); 
		Employee employee = factory.getBean("employee", Employee.class);
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
