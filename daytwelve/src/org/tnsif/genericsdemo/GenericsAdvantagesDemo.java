package org.tnsif.genericsdemo;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantagesDemo {

	public static void main(String[] args) {
		//Typesafety
		//without generics
		List obj=new ArrayList<>();
		obj.add(15);
		obj.add("15");
		System.out.println("without generics: "+obj);
		//with generics
		List<Integer>obj1=new ArrayList<>();
		obj1.add(15);
		//obj.1add("15");
		
		System.out.println("without generics: "+obj1);
		
		//typecasting is not allowed in generics
		ArrayList obj2=new ArrayList<>();
		obj2.add("Sayali");
		String s=(String)obj2.get(0);
		System.out.println(s);
		
		//with generics typecasting is not allowed
		ArrayList<String>obj3=new ArrayList<>();
		obj3.add("Sayali");
		String s1=obj3.get(0);
		System.out.println(s1);
		
		
		

	}

}
