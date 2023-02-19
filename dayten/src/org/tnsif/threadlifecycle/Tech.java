package org.tnsif.threadlifecycle;

public class Tech extends Thread {
	public void run()
	{
		System.out.println("Java Full Stack Training");
		for (int i=0;i<=5;i++)
		{
			System.out.println( i+ " ");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
	}
	

}
