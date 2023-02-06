package org.tnsif.accessspecifier;

public class AccessSpecifierExample {

	//data members
	private String name;
	/*if any data member is default it will access only inside the same package*/
	//void display()
	public void display()
	{
		System.out.println("The name is "+name);
	}
	//generate getters and setters for private data members
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
