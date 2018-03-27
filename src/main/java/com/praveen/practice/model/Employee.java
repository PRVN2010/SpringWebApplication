package com.praveen.practice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String name;
	private int salary;
	@Autowired
	private Address address;
	
	public Employee(){
		System.out.println("Default constructor of Employee is created.");
	}
	
	public Employee(Address address){
		System.out.println("parameter constructor called.");
		this.address = address;
	}
	
	public Employee(int salary){
		this.salary = salary;
	}
	
	public Employee(String name){
		this.name = name;
	}
	
	public Employee(String name, int salary){
		System.out.println("Parameterized constructor of Employee created.");
		this.name = name;
		this.salary = salary;
		
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	/*public void setSalary(int salary) {
		this.salary = salary;
	}*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress(){
		return address;
	}

}
