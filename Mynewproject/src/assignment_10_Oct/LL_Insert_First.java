package assignment_10_Oct;

import java.util.LinkedList;

public class LL_Insert_First {

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
		
		ll.addFirst("Iron Man");
		
		System.out.println("\nAdded First\n");
		for(String s:ll)
		{
			System.out.println(s);
		}
	}

}
