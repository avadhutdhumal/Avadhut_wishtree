package collection_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class String_Sort {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("Pooja");
		al.add("Dhananjay");
		al.add("Mayur");
		al.add("Rohan");
		al.add("Siddhant");
		al.add("Dnyaneshwar");
		al.add("Prajwal");
		al.add("Najma");
		al.add("Dattatray");
		al.add("Raksha");
		al.add("Shweta");
		al.add("Rohit");
		
		Collections.sort(al);
		
		for(String s: al)
		{
			System.out.println(s);
		}
	}

}
