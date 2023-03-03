package org.tnsif.setdemo;

public class Student {
	//private data members
	private int rollno;
	private String name;
	private float percentage;
	//parametrised constracutor
	public Student(int rollno, String name, float percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	 //getters n setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	//tostring 
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	
	
	

}
