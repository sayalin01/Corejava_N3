package org.tnsif.instanceofdemo;
//child class
//to demonstrate the result of instanceof operator 
public class Child extends Person{
	private int age;
	//getters and setters

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//generate construct superclass

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(String name, String address,int age) {
		super();
		this.age=age;
		// TODO Auto-generated constructor stub
	}
	//to string

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	
	
	

}
