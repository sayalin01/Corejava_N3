package org.tnsif.thiskeyword;
class HR 
{
	void display1 (HR obj)
	//void display()
	{
		System.out.println("Human Resource");
	}
	void display ()
	//void display()
	{
		display1(this);
	}
}

public class ThisKeywordExecutor {
	

	public static void main(String[] args) {
		HR h = new HR();
		h.display();

	}

}
