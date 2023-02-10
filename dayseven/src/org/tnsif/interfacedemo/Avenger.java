package org.tnsif.interfacedemo;

//implementable class
public class Avenger implements Bike {

	@Override
	public int milage(int speed) {
		System.out.println("speed" +speed);
		return 0;
	}

	@Override
	public void engine() {
		System.out.println("working on petrol");
		
	} 

}
