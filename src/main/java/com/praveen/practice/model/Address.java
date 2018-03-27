package com.praveen.practice.model;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String street;
	private String city;
	
	public Address(){
		System.out.println("Address object is created.");
	}
	
	public Address(String street, String city){
		System.out.println("Parameterized constructor  of Address is created.");
		this.street = street;
		this.city = city;
	}

	public void getAddress(){
		System.out.println("Street "+street+",City "+city);
	}
}
