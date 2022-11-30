package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedMap1 {

	public static void main(String[] args) {
HashMap<Integer,String> hs=new HashMap<>();
		
		hs.put(1, "pen");
		hs.put(2, "pencil");
		hs.put(3, "cardboard");
		hs.put(16, "books");
		hs.put(4, "scale");
		
		
		TreeMap<Integer,String> sm=new TreeMap<Integer,String>(hs);
		System.out.println(sm);
		SortedMap<Integer,String> sm1 =	sm.subMap(2, 16);
		
		System.out.println(sm1);
		
		TreeMap<Integer,String> ts=new TreeMap<Integer,String>(sm1);
		System.out.println(ts);

	}

}
