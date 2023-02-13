package org.tnsif.arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number of elements "+"in the array");
		int n = s.nextInt();
		//array declaration
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		//
		for (int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		//
		
		System.out.println("Array elements are : ");
		for (int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		//to  sort an array elements
		System.out.println("Elements after sorting");
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		//enhance for loop 
		System.out.println("itr array is : ");
		
		for(int itr:arr)
		{
			System.out.println(itr +" ");
		}
		
		

	}

}
