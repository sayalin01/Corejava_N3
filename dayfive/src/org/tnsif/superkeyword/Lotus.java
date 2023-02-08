package org.tnsif.superkeyword;

public class Lotus extends Flower {
	private String name;
	//getters and setters 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//default

	public Lotus() {
		super();
		// TODO Auto-generated constructor stub
	}
//para
	public Lotus(String name) {
		super(name);
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println(name);
		super.setName("flower");
		System.out.println(super.getName());
		
	}
	
	
}
