package collection_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList12 {

	public static void main(String[] args) {
		/*
		 * ArrayList al=new ArrayList();//non generic form al.add(10); al.add("abc");
		 * al.add(34.56f);
		 * 
		 * System.out.println(al); Collections.sort(al); System.out.println(al);
		 */
		//Iteration
		
		ArrayList<Integer> al2=new ArrayList<Integer>();//Generic form<Integer>
		//ArrayList<Customer> al3=new ArrayList<Customer>();//comparable,comparator
		al2.add(45);
		al2.add(67);
		al2.add(12);
		al2.add(2);
		
		//1s way
		System.out.println(al2);
		
		al2.add(2,100);
		System.out.println(al2);
		
		System.out.println("-----------");
		//2ndway(For loop)
		System.out.println(al2.size());
		System.out.println(al2.get(3));
		
		
		System.out.println("-----------");
		for(int i=0;i<al2.size();i++)
		{
			System.out.println(al2.get(i));
		}
		
		System.out.println("-----------");
		//3dway(for each loop)
		
		for(Integer i:al2)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------");
		//4th way
		Iterator<Integer> it=al2.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//5thway
		System.out.println("-----------");
		ListIterator<Integer> li=al2.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("-----------");
ListIterator<Integer> li1=al2.listIterator(al2.size());
		
		while(li1.hasPrevious())
		{
			System.out.println(li1.previous());
		}
		
		
		
		

	}

}
