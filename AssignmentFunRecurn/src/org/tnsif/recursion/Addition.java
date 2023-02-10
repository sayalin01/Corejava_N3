package org.tnsif.recursion;
import java.util.*;
public class Addition {
	static int add(int x, int y)
	{
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Two numbers to add :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.print("addition : "+ add(x,y));
	}

}
