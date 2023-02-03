package org.tnsif.DecisionMaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a,b: ");
		int a = s.nextInt();
		int b = s.nextInt();
		if(a==b)
			System.out.println("a is equal to b");
		else
			System.out.println("a is not equal to b");


	}

}
