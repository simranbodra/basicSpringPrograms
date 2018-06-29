package com.bridgelabz.javabasedannotation.importannotation;

import org.springframework.context.annotation.Bean;

public class CustomerConfig {
	@Bean(name = "customer")
	public CustomerBo customerBo() {

		return new CustomerBo();

	}
}
