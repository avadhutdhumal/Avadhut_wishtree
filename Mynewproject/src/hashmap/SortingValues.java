package hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortingValues {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		ArrayList<String> al=new ArrayList<String>();
		LinkedHashMap<Integer,String> ls=new LinkedHashMap<Integer,String>();
		hs.put(12, "pooja");
		hs.put(3, "ram");
		hs.put(6, "kavya");
		hs.put(4, "sonal");
		
		// how to sort map on basis of keys
		
	/*	TreeMap<Integer,String> ts=new TreeMap<Integer,String>(hs);
		System.out.println(ts);*/
		
		//how to sort map on basis of values.
		
		
		Collection c=hs.values();
		Iterator<String> it=c.iterator();
		
		while(it.hasNext())
		{
			String s=it.next();
			al.add(s);
		}
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("--- with sorted----");
		System.out.println(al);
		
		Iterator<String> it1=al.iterator();
		
		while(it1.hasNext())
		{
			String s1=it1.next();
			Set<Entry<Integer,String>>   entry= hs.entrySet();
			for(Map.Entry<Integer, String> map:entry)
			{
			
				String s2=map.getValue();
				Integer i=map.getKey();
				if(s1.equals(s2))
				{
					ls.put(i,s1);
				}
			}
		}
		
		System.out.println(ls);
		
		
		
		
		
		
		

	}

}
