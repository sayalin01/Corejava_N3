package org.tnsif.polimorphism;

public class HondaCity {
	private int speed;
	private String colour;
	
	//getters setters
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	//generate default constructor
	public HondaCity() {
		System.out.println("It is a good car");
		// TODO Auto-generated constructor stub
	}
	//generate using fields
	public HondaCity(int speed, String colour) {
		super();
		this.speed = speed;
		this.colour = colour;
		System.out.println("speed is: "+speed+","+"colour is:"+colour);
	}
	
	
	
	
	

}
