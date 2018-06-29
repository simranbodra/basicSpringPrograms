package com.bridgelabz.javabasedannotation.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloworld = context.getBean(HelloWorld.class);
		helloworld.setMessage("Good Morning");
		System.out.println(helloworld);
	}

}
