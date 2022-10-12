package collection_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Interger_Sort {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(55);
		al.add(25);
		al.add(12);
		al.add(98);
		al.add(15);
		al.add(78);
		al.add(35);
		al.add(47);
		al.add(35);
		
		Collections.sort(al);
		
		for(Integer i: al)
		{
			System.out.println(i);
		}
	}

}
