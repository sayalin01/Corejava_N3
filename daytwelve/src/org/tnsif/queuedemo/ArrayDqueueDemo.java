package org.tnsif.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDqueueDemo {

	public static void main(String[] args) {
		Deque<String>obj=new ArrayDeque<>();
		obj.add("sayali");
		obj.addFirst("shreya");
		obj.add("pallavi");
		System.out.println("Array Deque elements are: "+obj);
		for(String i:obj) {
			System.out.print(i+" ");
		}
		System.out.println();
		obj.remove();
		System.out.println("Array Deque elements are: "+obj);
		
		obj.removeFirst();
		System.out.println("Array Deque elements are: "+obj);
		obj.removeLast();
		System.out.println("Array Deque elements are: "+obj);
		
		

	}

}
