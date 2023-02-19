package org.tnsif.usingrunnable;

public class Marathon implements Runnable{
	//private data members 
	private int speed;
	private String city;

	//runnable is a functional interface and it contains the run() method by default
	@Override
	public void run() {
		System.out.println("Speed od a participant: "+speed +"  "+" The city is: "+city);
		
		
	}

	
	//getters n setters 
	public int getSpeed() {                 
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	
	
	
	

}
