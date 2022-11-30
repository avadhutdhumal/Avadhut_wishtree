package assignment_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Iterate_Map {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(10,"Rio");
		hm.put(20,"Helsinki");
		hm.put(30,"Nirobi");
		hm.put(40,"Rachel");
		hm.put(50, "Tokiyo");
		
		System.out.println("********Using key Set*******");
		
		Set<Integer> se=hm.keySet();
		Iterator<Integer> it=se.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("\n********Using Values********");
		
		Collection col=hm.values();
	    Iterator<String> it1=	col.iterator();
	    while(it1.hasNext())
	    {
		System.out.println(it1.next());
	    }
		
	    System.out.println("\n********Using Entry Set********");
	    
	    Set<Entry<Integer,String>> ent=hm.entrySet();
	    
	      Iterator<Entry<Integer,String >> it2= ent.iterator();
	      while(it2.hasNext())
	      {
	    	Entry<Integer,String>  en= it2.next();
	    	System.out.println(en.getKey() +"  "+ en.getValue());
	      }
	}

}
