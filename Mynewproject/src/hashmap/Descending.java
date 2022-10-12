package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Descending {

	public static void main(String[] args) {
		//pune, nagpur, jalgoan, amehdnagar, Amehdabad
		
		ArrayList<String> al=new ArrayList<String>();
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			al.add(sc.next());
		}
		
		//Object[] s= al.toArray();
		
		/*TreeSet<String> ts=new TreeSet<String>(al);
		System.out.println(ts);*/
		
		
		
	/*	for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(((String) s[i]).charAt(0)>((String) s[j]).charAt(0))
				{
					String temp=(String) s[i];
					s[i]=s[j];
					s[j]=temp;
				}
		
	}

}*/
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				String a=al.get(i);
				String b=al.get(j);
				if(al.get(i).charAt(0)>al.get(j).charAt(0))
				{
					String temp=al.get(i);
					System.out.println(temp);
					al.set(i, b);
					al.set(j, temp);
					
				}
			}
		
		
	}
		System.out.println(al);
}
}
