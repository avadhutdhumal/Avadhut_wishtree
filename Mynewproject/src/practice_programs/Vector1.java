package practice_programs;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<> ();
		v.add(10);
		v.add(25);
		v.add(13);
		v.add(1, 10);
		System.out.println(v);
		Enumeration<Integer> en=v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
//		System.out.println(v.elements());
		
	for (int i = 0; i < v.size(); i++) {
		System.out.println(v.get(i));
	}
	}
	
//	Enumeration<Integer> em= v
}
