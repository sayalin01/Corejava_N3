package org.tnsif.polimorphism;

public class SBI extends RBI {
	float getInterest()
	{
		System.out.println(super.getInterest());
		return 10.8f;
	}
	

}
