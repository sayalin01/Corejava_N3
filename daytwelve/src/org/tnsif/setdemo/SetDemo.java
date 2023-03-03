package org.tnsif.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//program to demonstrate on difference between hashset and LinkedHashSet
public class SetDemo {

	public static void main(String[] args) {
		//HashSet will print elemnts randomly
		Set<Object>obj1=new HashSet<>();
		obj1.add(11);
		obj1.add("sayali");
		obj1.add(47.29);
		System.out.println("The elemnts of sets are: "+obj1);
		
		//LinkedHashSet will print elements order wise
		Set<Object>obj2=new LinkedHashSet<>();
		obj2.add(11);
		obj2.add("sayali");
		obj2.add(47.29);
		System.out.println("The elemnts of sets are: "+obj2);
		//obj2.clear();
		System.out.println("The elemnts of sets are equal? : "+obj2.equals(obj1));
		
		

	}

}
