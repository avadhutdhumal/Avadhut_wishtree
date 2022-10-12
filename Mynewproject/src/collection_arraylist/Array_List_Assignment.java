package collection_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Assignment {

	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList<>();
		
		for (int i = 0; i <=50; i++) {
			al.add(i);	
		}
		
//		for (int i = 0; i <=50; i++)
//		if (al.get(i)%2==0)
//		{
//		System.out.println(al.get(i)+" ");
//		}
		
		
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			Integer i=it.next();
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
