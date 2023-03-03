package org.tnsif.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List <Object>obj1=new ArrayList<>();
		obj1.add(100);
		obj1.add(13.4f);
		obj1.add('s');
		obj1.add(13.4);
		System.out.println("The  List is: "+obj1);
		System.out.println("Size of obj1 is : "+obj1.size());
		System.out.println("Is List2 empty?: "+obj1.isEmpty());
		obj1.remove(0);
		System.out.println("The new List is: "+obj1);
		System.out.println("Is obj1 contains 100? : "+obj1.contains(100));
		System.out.println("Element at index 1 : "+obj1.get(1));
		System.out.println("The index of s is : "+obj1.lastIndexOf('s'));
		System.out.println("The Last index of 13.4 is : "+obj1.lastIndexOf(13.4));
		//obj1.clear(); //remove all the elements from list 1
		//System.out.println("The new  List is: "+obj1);
		//to extract the elements from the list
		for(Object i:obj1)
		{
			System.out.println(i+" ");
		}
		List <Integer>obj2=new ArrayList<>();
		obj2.add(30);
		obj2.add(45);
		obj2.add(18);
		System.out.println("The List3 is "+obj2);
		//sort list in ascending order
		Collections.sort(obj2);
		System.out.println("The sorted List3 is"+obj2);
		//reverse or descending  the elements in list3
		Collections.reverse(obj2);
		System.out.println("The reverse list3 is: "+obj2);
		
		
		
		
		
		

	}

	}


