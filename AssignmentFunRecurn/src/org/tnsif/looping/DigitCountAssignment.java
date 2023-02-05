package org.tnsif.looping;

import java.util.Scanner;

public class DigitCountAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the digit: ");
		int num = s.nextInt();
		int count = 0;
		while (num>0)
		{
			num = num/10 ;
			count++;
		}
		System.out.println("total number of digits is: "+count);
		

	}

}
