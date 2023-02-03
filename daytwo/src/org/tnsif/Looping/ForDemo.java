package org.tnsif.Looping;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to demonstrate example on for loop 
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" ");
		}
		System.out.println();
		for(int i=n;i>=0;i--)
		{
			System.out.println(i+" ");
		}
	}

}
