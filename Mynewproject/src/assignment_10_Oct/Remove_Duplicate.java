package assignment_10_Oct;

import java.util.ArrayList;

public class Remove_Duplicate {

	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList<String>();
		al.add("d");
		al.add("g");
		al.add("h");
		al.add("d");
		al.add("d");
		al.add("h");
		al.add("g");
		System.out.println("Original Arraylist: ");
		for(String s:al)
		{
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println("\nDuplicates Removed: ");
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				String s1=al.get(i);
				String s2=al.get(j);
				if(s1.equals(s2) && !(al.get(j).equals("null")))
				{
					al.set(j, "null");
				}
			}
				if(!(al.get(i).equals("null")))
				{
					System.out.print(al.get(i)+" ");
				}
			}

}
}