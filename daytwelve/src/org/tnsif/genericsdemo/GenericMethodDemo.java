package org.tnsif.genericsdemo;
class GenericMethod{
	public static<E>void print (E[] elements)
	{
		for(E itr:elements) 
		{
			System.out.println(itr+" ");
		}
		System.out.println();
		
	}
}

public class GenericMethodDemo {
	

	public static void main(String[] args) {
		GenericMethod m =new GenericMethod();
		Integer[] array1= {10,20,30,40};
		Character[]array2= {'a','b','c','d'};
		m.print(array1);
		m.print(array2);

	}

}
