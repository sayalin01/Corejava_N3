package org.tnsif.polimorphism;

import java.util.Scanner;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the resolution and slottype "+ "of a cellphone");
		int resolution =s.nextInt();
		s.nextLine();
		String slottype=s.nextLine();
		Smartphone sp=new Smartphone();
		sp.setResolution(resolution);
		sp.setSlottype(slottype);
		sp.display(resolution);
		sp.display(resolution, slottype);
		
		Multiplication m = new Multiplication ();
		System.out.println(m.mul(11,5));
		System.out.println(m.mul(11.5f,5));

	}

}
