package org.tnsif.multilevelinheritance;
//child class 2
public class iphone extends android {
	private String slottype;
	public void slot()
	{
		System.out.println("slottype is: "+slottype);
	}
//getters and setters 
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	//const from superclass
	public iphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public iphone(int modelno,String version,String slottype) {
		super();
		this.slottype = slottype;
	}
	@Override
	public String toString() {
		return "iphone [slottype=" + slottype + ", getVersion()=" + getVersion() + ", getModelno()=" + getModelno()
				+ "]";
	}
	
	
	
}
