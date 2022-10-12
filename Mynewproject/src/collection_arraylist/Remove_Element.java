
package collection_arraylist;

import java.util.ArrayList;

public class Remove_Element {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		
		str.add("Monday");
		str.add("Tuesday");
		str.add("Wednesday");
		str.add("Thursday");
		str.add("Friday");
		str.add("Saturday");
		str.add("Sunday");
//		str.add("Thursday");
		
		System.out.println("Orignal :"+"\n"+ str);
		
		System.out.println("\nUpdated: ");
		for (int i = 0; i < str.size(); i++) 
		{
			if (str.get(i).length()>7) 
			{
				str.remove(i);
				i--;
			}

		}
		System.out.print(str);

	}

}

/*Create arraylist of string. Add 7 days to list (Monday , Sunday
etc) remove elements from list for which string length is more
than 7*/