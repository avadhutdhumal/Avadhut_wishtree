package assignment_10_Oct;

import java.util.LinkedList;

public class LL_Remove {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Captain America");
		ll.add("Thor");
		ll.add("Ms.Marvel");
		ll.add("Avengers");

		System.out.println("Printing LinkedList\n");
		for (String s : ll) {
			System.out.println(s);
		}

		System.out.println("\nFirst Element is: "+ll.removeFirst());
		
		System.out.println("\nRemoved First\n");
		for (String s : ll) {
			System.out.println(s);
		}
		
		
		

	}

}
