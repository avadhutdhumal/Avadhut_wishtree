package collection_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
//		ArrayList<Customer> a2=new ArrayList<Customer>();
		
		al.add(100);
		al.add(30);
		al.add(56);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("rahul");
		al2.add("priya");
		al2.add("abhay");
		Collections.sort(al2);
		System.out.println(al2);
		

	}

}
