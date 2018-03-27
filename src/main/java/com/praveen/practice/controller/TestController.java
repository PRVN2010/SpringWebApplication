package com.praveen.practice.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.praveen.practice.model.Employee;

public class TestController {
	
	public static void main(String...s){
		
		ApplicationContext context = new FileSystemXmlApplicationContext("E:/Java/STS/SpringPracticeApp/src/main/resources/spring/application-config.xml");
		Employee emp = (Employee)context.getBean("emp");
		System.out.println(emp.getName()+" "+emp.getSalary());
		emp.getAddress().getAddress();
	}

}  
