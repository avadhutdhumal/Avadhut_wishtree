package collection_arraylist;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayList15 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(45);
		al.add(88);
		al.add(20);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(45);
		al1.add(88);
		al1.add(33);
		
		System.out.println(al.lastIndexOf(20));
		al1.retainAll(al);
		
		System.out.println(al1);
	
		
		Collections.sort(al);
		System.out.println(al);
		
		List<Integer> al3=al.subList(1, 5);
		System.out.println(al3);
		
		String s=al.toString();
		System.out.println(s);
		
	}

}
