package org.tnsif.abstractiondemo;

public class AbstractionDemo {

	public static void main(String[] args) {
			ButterChicken b= new ButterChicken();
			//cannot instantiate the abstract class
			
			//Menu m =new Menu();
			b.foodtype();
			b.menuType();
			b.recipe();

	}

}
