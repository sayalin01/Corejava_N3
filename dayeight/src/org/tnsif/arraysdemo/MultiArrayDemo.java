package org.tnsif.arraysdemo;
import java.util.*;
public class MultiArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr [][]=new int [n][m];
		for(int i=0;i<n;i++)
		{
			for(int j =0;j<m;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j =0;j<m;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(arr[0][1]);

	}

}
