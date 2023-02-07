package org.tnsif.multilevelinheritance;

public class Nokia {
	//private data members
	private int modelno;
	public void display()
	{
		System.out.println("The model no. is ");
	}
	//default constructor
	public Nokia() {
		System.out.println(" Nokia Class" );
	}
	//parameterized costructor 
	public Nokia(int modelno) {
		super();
		this.modelno = modelno;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	
	
	
}
