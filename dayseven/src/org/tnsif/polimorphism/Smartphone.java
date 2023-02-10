package org.tnsif.polimorphism;
//program to demonstrate on method overloading
public class Smartphone {
	//private data members
	private int resolution;
	private String slottype;
	//method overloading in terms by passing no.of arguments
	void display(int resolution)
	{
		System.out.println("Camera Resolution: "+resolution);
	}
	void display(int resolution,String slottype)
	{
		System.out.println("Camera Resolution: "+resolution+","+"slottype: " +slottype);
		
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	

}
