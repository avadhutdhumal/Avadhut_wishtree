package collection_arraylist;

import java.util.ArrayList;

public class ArrayList11 {

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>(3);
	al.add(23);
	al.add(56);
	al.add(78);
	al.add(90);
	
	al.add(null);
	
System.out.println(al);
System.out.println(al.size());
System.out.println(al.get(3));

for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
	
}
	
	

	}

}
