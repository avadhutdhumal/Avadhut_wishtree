package collection_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Print_Arraylist {

	public static void main(String[] args) {
//		
		ArrayList<String> str=new ArrayList<String>();
		str.add("Avadhut");
		str.add("Mayur");
		str.add("Rohan");
		str.add("Rocky");
		System.out.println("Original: " + str);
		
//		1st way
		System.out.println("\n---------Iterator-----------");
		Iterator<String> it = str.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}

//		2nd way
		System.out.println("\n----------For Loop-------------");
		for (int i = 0; i < str.size(); i++) 
		{
			System.out.println(str.get(i));
		}

		System.out.println("\n----------For Each Loop-------------");

		for (String s : str) 
		{
			System.out.println(s);
		}

	}

}
/*WAP to print all elements of ArrayList<String> using -
-Iterator
-for loop
-for each*/