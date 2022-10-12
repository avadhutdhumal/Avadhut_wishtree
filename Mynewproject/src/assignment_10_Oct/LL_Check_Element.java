package assignment_10_Oct;

import java.util.LinkedList;

public class LL_Check_Element {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Captain America");
		ll.add("Thor");
		ll.add("Ms.Marvel");
		ll.add("Avengers");
		
		System.out.println(ll.contains("Thor"));
		System.out.println(ll.contains("Valkary"));
		
	}

}
