package org.tnsif.polimorphism;

public class Multiplication {
	
	//method overloading in terms of by changing the data types
	int mul(int x,int y)
	{
		return x*y;
	}
	int mul(float x,int y)
	{
		return (int)(x*y);
	}

}
