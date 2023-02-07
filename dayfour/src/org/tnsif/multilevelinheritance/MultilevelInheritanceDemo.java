package org.tnsif.multilevelinheritance;

import java.util.Scanner;

//driver class
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iphone I = new iphone();
		iphone I1 = new iphone(1231,"jdshd","SingleSlot");
		I1.accept();
		I1.display();
		I1.slot();
		System.out.println(I1);
	}

}
