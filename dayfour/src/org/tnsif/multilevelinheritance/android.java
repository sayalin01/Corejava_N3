package org.tnsif.multilevelinheritance;

//child class
public class android extends Nokia{
	private String version;
	public void accept()
	{
		System.out.println("The android version name is: "+version);
	}
	//getters setters
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	//constructor superclass
	public android() {
		super();
		// TODO Auto-generated constructor stub
	}
	public android(String version ) {
		super();
		this.version = version;
		// TODO Auto-generated constructor stub
	}
	
}
