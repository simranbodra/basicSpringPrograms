package com.bridgelabz.javabasedannotation.beanlifecycle;

public class Foo {
	
	private String foo;
	
	public void setFoo(String foo) {
		this.foo = foo;
	}
	
	public String getFoo() {
		return foo;
	}
	public void init() {
		// initialization logic
		System.out.println("Init method");
	}

	public void cleanup() {
		// destruction logic
		System.out.println("destroy method");
	}
}
