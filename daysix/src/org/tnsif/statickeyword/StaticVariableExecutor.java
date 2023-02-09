package org.tnsif.statickeyword;
//program to demonstrate on static variable
//driver class
public class StaticVariableExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s=new StaticVariable("Nia Lopez");
		System.out.println(s);
		//use classname.variablename to print static variable
		System.out.println(StaticVariable.companyName);

	}

}
