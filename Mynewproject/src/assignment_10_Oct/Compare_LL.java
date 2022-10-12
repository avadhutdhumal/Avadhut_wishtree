package assignment_10_Oct;

import java.util.*;

public class Compare_LL {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Captain America");
		ll.add("Dilwale");
		ll.add("Ms.Marvel");
		ll.add("Avengers");
		ll.add("Iron man");
		
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Captain America");
		ll1.add("Thor");
		ll1.add("Ms.Marvel");
		ll1.add("Hera Pheri");
		ll1.add("Iron man");

		LinkedList<String> ll2 = new LinkedList<String>();
		for (String e : ll)
			ll2.add(ll1.contains(e) ? "Yes" : "No");
		System.out.println(ll2);

	}

}
