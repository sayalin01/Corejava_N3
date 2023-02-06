package org.tnsif.classandobject;

public class Customer {
	int id;
	String custname;
	String city;
	//default construcot
	public Customer() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustname() {
		return custname;
	}
	
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//parameterized constructor 
	public Customer(int id,String custname,String city) {
		this.id=id;
		this.city =custname;
		this.city =city;
		
		
	}
	void display()
	{
		System.out.println(id+" "+custname+" "+city);
	}
	

}
