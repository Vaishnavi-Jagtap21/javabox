package lists;

import java.util.PriorityQueue;

public class Priorityqueueex {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<>();
		
		//Adding Element
		queue.offer("Vaishnavi");
		queue.offer("Dipika");
		queue.offer("Poonam");
		queue.offer("Nisha");
		
		//Inspecting the highest priority element
		System.out.println(queue.peek()); //Dipika
		for(String elt:queue)
		{
			System.out.println(elt);
		}
		//Removing Element
		System.out.println(queue.poll()); //Dipika
		System.out.println(queue.poll()); //Vaishnavi
		
		//Checking if the queue is empty
		System.out.println(queue.isEmpty()); //true

	}

}
