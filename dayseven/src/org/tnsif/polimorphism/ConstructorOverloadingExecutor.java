package org.tnsif.polimorphism;

import java.util.Scanner;

public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed and colour of "+"a Hondacity");
		int speed = s.nextInt();
		s.nextLine();
		String colour =s.nextLine();
		HondaCity c = new HondaCity();
		HondaCity c1 = new HondaCity(speed,colour);
		

	}

}
