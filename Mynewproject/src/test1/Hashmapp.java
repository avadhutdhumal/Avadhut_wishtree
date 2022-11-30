package test1;

import java.util.*;
import java.util.Map.Entry;

public class Hashmapp {

	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(16, "pooja");
		hs.put(12, "ram");
		hs.put(18, "ramesh");
		hs.put(14, "kinjal");
		hs.put(14, "sonu");
		hs.put(14, "xyz");

		Set<Entry<Integer, String>> se = hs.entrySet();
		Iterator<Entry<Integer, String>> it = se.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> en=it.next();
			Integer i = en.getKey();
			String s = en.getValue();
			System.out.println(i+"  "+s);
		}

	}

}
