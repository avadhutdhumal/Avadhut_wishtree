package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapInternal {

	public static void main(String[] args) {
	HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(16, "pooja");
		hs.put(12, "ram");
		hs.put(18, "ramesh");
		//hs.put(null, "abc");
		
		String s=hs.get(18);
		System.out.println(s);
		
		System.out.println(hs);

		
		TreeMap<Integer,String> ts=new TreeMap<Integer,String>(hs);
		
		
		System.out.println(ts);
		
		
	}

}
