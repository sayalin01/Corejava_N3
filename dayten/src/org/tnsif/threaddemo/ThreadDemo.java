package org.tnsif.threaddemo;
import java.lang.Thread;
public class ThreadDemo {                                             

	public static void main(String[] args) {
		Thread t =new Thread();
		System.out.println("Current Thread : "+t);
		try
		{
			Thread.sleep(1);
		}
		catch (InterruptedException e)
		{
			System.out.println("Main Tread Interrupted");
		}

	}

}
