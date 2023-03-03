package org.tnsif.listdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		obj.push("Sayali");
		obj.push("Shreya");
		obj.push("Pallavi");
		obj.push("Poonam");
		System.out.println("The elements inside the stack are: "+obj);
		obj.pop();
		System.out.println("The elements inside the stack are: "+obj);
		

	}

}
