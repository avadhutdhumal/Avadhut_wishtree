package Written_Test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Ques20 {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(4);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(1);
		ll.add(4);

		int num;
		String s = null;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		Iterator<Integer> it = ll.iterator();
		while (it.hasNext()) {
			num = it.next();

			switch (num) {
			case 1:
				s = "One";
				break;
			case 2:
				s = "Two";
				break;
			case 3:
				s = "Three";
				break;
			case 4:
				s = "Four";
				break;
			case 5:
				s = "Five";
				break;
			}

			if (!hm.containsKey(s)) {
				hm.put(s, 1);
			} else {
				int count = hm.get(s);
				hm.put(s, count + 1);
			}
		}

		System.out.println(hm);
	}
}
/*
 * 20. There is a linked list which contains numbers from 1 to 5 . {
 * 1,4,2,1,3,1,4} . Create a map which contains string which is number in words
 * and number of times that number has appeared in list. . E.g. output map for
 * above list will be map { (“one”,3) , (“two”,1),(“three” , 1),(“four”,2)}.
 * Make use of switch statement to get number in words.
 */
