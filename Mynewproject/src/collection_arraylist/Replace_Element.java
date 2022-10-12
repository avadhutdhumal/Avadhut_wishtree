package collection_arraylist;
import java.util.ArrayList;

public class Replace_Element {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println("Original: "+al);
		
		al.set(3,25);
		System.out.println("Updated: "+al);
		

	}

}
/*WAP to replace the second element of an ArrayList with the specified
element.{1,2,3,4,5};
100*/
