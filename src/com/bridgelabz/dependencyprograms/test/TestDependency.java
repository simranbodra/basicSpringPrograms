package com.bridgelabz.dependencyprograms.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.dependencyprograms.model.Student;

public class TestDependency {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Dependency.xml");  
	    BeanFactory factory = new XmlBeanFactory(resource);  

	    Student student=(Student)factory.getBean("student");  
	    student.display(student.getName(), student.getId());
	    student.setId(10);  
	    System.out.println(student.hashCode());
	    student.display(student.getName(), student.getId());
	    student.setName("Shruti");
	    student.display(student.getName(), student.getId());
	    
	    Student student1 = (Student)factory.getBean("student");
	    System.out.println(student1.hashCode());
	    student1.displayInfo();
	}

}
