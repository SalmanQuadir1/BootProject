package com.testingpro.testingPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testingpro.controller.HomeController;
import com.testingpro.model.Student;

@SpringBootApplication
@ComponentScan(basePackageClasses = HomeController.class)
public class TestingProApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingProApplication.class, args);
		System.err.println("helllooooo");
	

	}
	
	public String hello() {
		
		 return"hello";
	}

}
