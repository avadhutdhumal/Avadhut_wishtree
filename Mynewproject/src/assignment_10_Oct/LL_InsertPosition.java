package assignment_10_Oct;

import java.util.LinkedList;

public class LL_InsertPosition {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Captain America");
		ll.add("Thor");
		ll.add("Ms.Marvel");
		ll.add("Avengers");
		
		System.out.println("Printing LinkedList\n");
		for(String s:ll)
		{
			System.out.println(s);
		}
		
		ll.add(2, "Ironman");
		ll.add(4, "Hulk");
		
		System.out.println("\n--------Inserted--------\n");
		for(String s:ll)
		{
			System.out.println(s);
		}

	}

}
