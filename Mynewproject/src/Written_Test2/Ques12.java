package Written_Test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ques12 {

	public static void main(String[] args) {

		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		hs.put("Pooja", 7895);
		hs.put("Rohan", 3644);
		hs.put("Rohit", 3655);

		Set<Entry<String, Integer>> en = hs.entrySet();
		Iterator<Entry<String, Integer>> it = en.iterator();

		while (it.hasNext()) {
			Entry<String, Integer> enn = it.next();

			System.out.println(enn.getKey() + "   " + enn.getValue());
			hs.put("Mayur", 1256);
		}
	}
}

/*
 * When we use the Fail-fast iterator, it immediately throws
 * ConcurrentModificationException when an element is added or removed from the
 * collection while the thread is iterating over the collection. Examples:
 * Iterator in HashMap, Iterator on ArrayList, etc.
 */
