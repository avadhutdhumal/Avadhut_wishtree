package assignment_15Oct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Seprate_Charaters {

	public static void main(String[] args) {
		 LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
		    ArrayList <String> al=new ArrayList<String>();
		 	al.add("A+2");
			al.add("B+12");
			al.add("D+4");
			al.add("DD+5");
			
			Iterator<String> it=al.iterator();
			while(it.hasNext())
			{
				String s=it.next();
				String arr[]= s.split("\\+");
				for (int i = 0; i < arr.length-1; i++) {
					String a=arr[0];
					String b=arr[1];
					hm.put(a, b);
				}
			}
			System.out.println(hm);
	}

}
