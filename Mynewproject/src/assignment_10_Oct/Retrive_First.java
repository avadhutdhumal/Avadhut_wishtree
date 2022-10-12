package assignment_10_Oct;

import java.util.LinkedList;

public class Retrive_First {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Captain America");
		ll.add("Thor");
		ll.add("Ms.Marvel");
		ll.add("Avengers");

		System.out.println(ll.element());
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		
		System.out.println(ll);

	}

}
