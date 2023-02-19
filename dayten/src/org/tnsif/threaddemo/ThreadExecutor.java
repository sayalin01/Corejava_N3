package org.tnsif.threaddemo;
//driver class
public class ThreadExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleThreadProgram p =new SimpleThreadProgram(); 
		//use to change the thread name
		p.setName("Java Thread");
		//use to change the priority
		p.setPriority(8);
		//when thread calls to start method it will come to run method
		p.start();
		//once we call start method ,again we cannot call
		//p.start()
		System.out.println("Current Thread"+p);

	}

}
