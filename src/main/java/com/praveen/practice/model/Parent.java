package com.praveen.practice.model;

public class Parent {
	
	private String name;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setter method called.");
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
