package org.tnsif.polimorphism;
//parent class
public class RBI {
	float getInterest()
	{
		return 12.8f;
	}
	
	//if we use method overriding in same class we will get the error
	/*float getInterest()
	{
		return 10.8f;
	}*/
}
