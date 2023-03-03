package org.tnsif.genericsdemo;
//to specify which kind of type you are passing to class
public class GenericClass<T> 
{
	T x;
	//to add elements
	void display(T x)
	{
		this.x=x;
	}
	//to return elements
	T accept()
	{
		return x;
	}
	public static void main(String[] args)
	{
		GenericClass <String>obj1=new GenericClass<>();
		obj1.display("TechnoServe India");
		System.out.println(obj1.accept());

	}

}
