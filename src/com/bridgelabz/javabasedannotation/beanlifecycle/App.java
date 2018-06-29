package com.bridgelabz.javabasedannotation.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Foo foo = (Foo) context.getBean(Foo.class);
		foo.setFoo("foo");
		System.out.println(foo.getFoo());
		
		((ConfigurableApplicationContext)context).close();
	}

}
