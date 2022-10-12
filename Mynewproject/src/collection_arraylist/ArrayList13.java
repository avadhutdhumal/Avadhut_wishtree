package collection_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList13 {

	public static void main(String[] args) {
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(45);
		al2.add(67);
		al2.add(12);
		al2.add(2);
		al2.add(null);
		
		
		System.out.println(al2);
		
		/*Merge
		 * ArrayList<Integer> al3=new ArrayList<Integer>(); al3.add(11); al3.add(12);
		 * al3.add(14); System.out.println("---------------"); System.out.println(al3);
		 * 
		 * System.out.println("------Merge---------"); al2.addAll(al3);
		 * System.out.println(al2);
		 */
		
		/*Remove
		 * System.out.println(al2.remove(2)); System.out.println(al2);
		 *		 * Scanner sc=new Scanner(System.in); int value=sc.nextInt(); Integer
		 * i=value;//autoboxing al2.remove(i); System.out.println(al2);
		 * 
		 * al2.removeAll(al2);
		 * 
		 * System.out.println(al2); System.out.println(al2.isEmpty());
		 */
		
		
		  //update
		
		al2.set(4,0);
		System.out.println(al2);
		
		ArrayList al3=(ArrayList) al2.clone();
		System.out.println(al3);
		
		
		boolean b=al2.contains(167);
		boolean b1=al2.containsAll(al3);
		
		
		
		if(b==true)
		{
			System.out.println("given element is present");
		}
		else
			System.out.println("given element is not present");
		
		
		if(b1==true)
		{
			System.out.println("two collections are equal");
		}
		else
			System.out.println("two collections are not equal");
		
		
		
		Class c=al2.getClass();
		System.out.println(c);
		
		System.out.println(al2.indexOf(2));
		Object[] al=al2.toArray();
		
		
		
		//to convert arrayList to array
		for(Object i:al)
		{
			System.out.println(i);
		}
		
		
		Integer[] arr=new Integer[al2.size()];
		arr=al2.toArray(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	   
	}

}
