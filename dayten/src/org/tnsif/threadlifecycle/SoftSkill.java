package org.tnsif.threadlifecycle;

public class SoftSkill extends Thread {
	public void run()
	{
		System.out.println("Professional ethics");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+ "");
		}
		System.out.println("Softskill Session");
	}
	

}
