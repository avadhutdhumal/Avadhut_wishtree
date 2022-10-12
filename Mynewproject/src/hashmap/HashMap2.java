package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(16, "pooja");
		hs.put(12, "ram");
		hs.put(18, "ramesh");
		hs.put(14,"kinjal");
		hs.put(14,"sonu");
		hs.put(14,"xyz");
		
		System.out.println(hs.containsKey(12));
		String s=hs.get(18);
		System.out.println(s);
		
		System.out.println(hs.hashCode());
		
		HashMap<Integer,String> hs1=new HashMap<Integer,String>();
		hs1.put(17, "priya");
		hs1.put(18, "abc");
		hs1.put(19, "ramesh");
		
		hs.putAll(hs1);
		
		System.out.println(hs);
		
		
		
	}

}
