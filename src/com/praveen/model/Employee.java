package com.praveen.model;

//@Component
public class Employee {
	
	private String empName;
	
	//@Autowired
	//private Address address;
	
	public Employee(){
		System.out.println("Employee object is created.");
	}
	
	/*@Autowired
	public Employee(Address address){
		this.address = address;
		System.out.println("Parameterized Employee constructor is called.");
	}
	public Address getAddress() {
		return address;
	}
	*/
	//@Autowired
	/*public void setAddress(Address address) {
		System.out.println("setter is called.");
		this.address = address;
	}*/
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

 
}
