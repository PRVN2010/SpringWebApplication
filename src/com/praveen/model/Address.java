package com.praveen.model;

//@Component
public class Address {
	
	private String street;
	private String city;
	
	public Address(){
		System.out.println("Address object is created.");
	}
	
	public Address(String street, String city){
		System.out.println("Address object is created.");
		this.street = street;
		this.city = city;
	}
	public String getAddress(){
		return "Streeat:"+street+", City:"+city;
	}

}
