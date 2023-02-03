package org.tnsif.DecisionMaking;

import java.util.Scanner;

public class CascadedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a,b,c: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a>b && a>c)
			System.out.println("a is greater than b and c ");
		else if(b>a && b>c)
			System.out.println("b is greater than a and c");
		else 
			System.out.println("c is greater than a and b");
		

	}

}
