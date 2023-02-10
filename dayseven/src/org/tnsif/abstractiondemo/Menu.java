package org.tnsif.abstractiondemo;

//abstract class
//class cannot be final abstract 
public abstract class Menu {
	//abstract method
	abstract void recipe();
	abstract void foodtype();
	
	//concrete method
	
	void menuType()
	{
		System.out.println("Veg and NonVeg");
	}
	
}
