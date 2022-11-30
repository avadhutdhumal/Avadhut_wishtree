package test1;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(15);
		v.add(20);
		v.add(63);
		
		Enumeration<Integer> en=v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		Iterator<Integer> i=v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
