package written_Test1;

import java.util.PriorityQueue;

public class Ques15 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();

		queue.add("Java");
		queue.add("Spring");
		queue.add("Angular");
		queue.add("Hibernate");
		queue.add("JavaScript");
		queue.add("Android");

		queue.peek();
		queue.poll();
		queue.poll();
		queue.peek();

		System.out.println("\n" + queue);

	}

}
