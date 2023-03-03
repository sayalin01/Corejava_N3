package org.tnsif.listdemo;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
	Vector<Integer>obj1=new Vector<>();
	obj1.add(1);
	obj1.add(13);
	obj1.add(20);
	obj1.add(13);
	System.out.println("The  List is: "+obj1);
	System.out.println("Size of obj1 is : "+obj1.size());
	System.out.println("Is List empty?: "+obj1.isEmpty());
	obj1.remove(0);
	System.out.println("The new List is: "+obj1);
	System.out.println("Is obj1 contains 1? : "+obj1.contains(1));
	System.out.println("Element at index 1 : "+obj1.get(1));
	System.out.println("The index of s is : "+obj1.lastIndexOf(13));
	System.out.println("The Last index of 13 is : "+obj1.lastIndexOf(13));

}
}
