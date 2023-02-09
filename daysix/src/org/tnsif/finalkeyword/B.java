package org.tnsif.finalkeyword;
//child class
public class B extends A {
	//cannot override the method
	/*void display ()
	{
		System.out.println("Hello");
	}*/ 
	// overloading 
	public void show (float price)
	{
		System.out.println("B price is :"+price);
	}
}
