package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.test"})
public class SpringBootValidation1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootValidation1Application.class, args);
	}

}
