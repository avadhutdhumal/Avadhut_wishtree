package assignment_10_Oct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL_TO_Arraylist {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Captain America");
		ll.add("Thor");
		ll.add("Ms.Marvel");
		ll.add("Avengers");
		
		List<String> al=new ArrayList<String>(ll);
		System.out.println("Displaying ArrayList\n");
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
