package org.tnsif.intro;

import java.util.Scanner;

//to demonstrate an example on user input 
public class userinputdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x =sc.nextInt();
		float y=sc.nextFloat();
		char z=sc.next().charAt(0);
		String name =sc.next();
		sc.nextLine();
		String str=sc.nextLine();
		//sc.nextLine();
		double d=sc.nextDouble();
		
		System.out.println("The value of x is" +x);
		System.out.println("The value of y is" +y);
		System.out.println("The value of z is" +z);
		System.out.println("The value of name is " +name);
		System.out.println("The value of src is " +str);
		System.out.println("The value of d is " +d);
	}

}
