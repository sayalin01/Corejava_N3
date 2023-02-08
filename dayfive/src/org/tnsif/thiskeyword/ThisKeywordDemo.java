package org.tnsif.thiskeyword;

public class ThisKeywordDemo {
	int a;
	int b;
	public void getData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void showData()
	{
		System.out.println("Value of A: "+a);
		System.out.println("Value of B: "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemo T = new ThisKeywordDemo();
		T.getData(1, 2);
		T.showData();
		

	}

}
