package written_Test1;

import java.util.LinkedList;
import java.util.List;

public class Ques14 {

	public static void main(String[] args) {
		List<String> yourList = new LinkedList<>();
		yourList.add("Angular");
		yourList.add("Hibernate");
		yourList.add("HTML");
		yourList.add("CSS");
		yourList.add("Spring");

		List<String> myList = new LinkedList<String>();
		myList.add("Angular");
		
		yourList.retainAll(myList);
		System.out.println(myList);

	}

}
