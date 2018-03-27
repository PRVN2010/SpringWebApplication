package com.praveen.practice.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praveen.practice.model.Child;
import com.praveen.practice.model.Parent;

public class MainController {
	
	
	public MainController() {
		System.out.println("Object is created for MainController");
	}
	
	@RequestMapping(value="/initHome",method=RequestMethod.GET)
	public String home(ModelMap map){
		map.addAttribute("message", "Hi");
		return "showMessage";
	}
	
	public static void main(String[] s){
		
		ApplicationContext context = new FileSystemXmlApplicationContext("E:/Java/STS/SpringPracticeApp/src/main/resources/spring/application-config.xml");
		
		Parent parent = (Parent)context.getBean("parent");
		System.out.println(parent.getName());
		Child child1 = (Child)context.getBean("child");
		child1.setName("pk");
		System.out.println(child1.getName());
		Child child2 = (Child)context.getBean("child");
		System.out.println(child2.getName());
		System.out.println(parent.getName());
	
		//Employee employee = (Employee)context.getBean("emp2");
		//System.out.println("Name :"+employee.getName()+" Salary: "+employee.getSalary());
		//employee.getAddress().getAddress();
		//Car emp =(Car)context.getBean("car");
	}
}
