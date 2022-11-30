package Written_Test2;
import java.util.*;

public class Ques21 {
	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		q.add("Virat");
		q.add("Sachin");
		q.add("Ajinkya");
		q.add("Kapil");
		q.add("Dhoni");
		
		System.out.println("Queue Original");
		for(Object o:q)
		{
			System.out.print(o+"  ");
		}
		
		System.out.println("\n\nQueue After Adding Shikhar");
		q.add("Shikhar");
		for(Object o:q)
		{
			System.out.print(o+"  ");
		}
		
		System.out.println("\n\nQueue After Peek");
		System.out.println(q.peek());
		System.out.println("\nQueue After Poll");
		q.poll();
		for(Object o:q)
		{
			System.out.print(o+"  ");
		}
		System.out.println("\n\nQueue After Offer");
		q.offer("Ashwin");
		for(Object o:q)
		{
			System.out.print(o+"  ");
		}
		
	}

}
