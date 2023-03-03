package org.tnsif.queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer>obj=new PriorityQueue<>();
		//add and offer method is use to insert an element
		obj.offer(67);
		obj.add(55);
		obj.add(91);
		obj.add(15);
		obj.add(11);
		
		System.out.println("Queue elements are: "+obj);
		obj.remove();
		System.out.println("Queue elements are: "+obj);
		//no exception occur even if there are no elements
		//baki same as remove
		/*obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();*/
		
		System.out.println("Queue elements are: "+obj.peek());
		
		
	}

}
