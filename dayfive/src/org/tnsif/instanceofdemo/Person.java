package org.tnsif.instanceofdemo;
//parent class 
//to demonstrate the result of instanceof operator 
public class Person {
	private String name;
	private String address;
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//generate constructor using superclass
	public Person() {
		System.out.println("parent class");
		// TODO Auto-generated constructor stub
	}
	//contsruct using field
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	//to string
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
