package collection_arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class Unique_Elements {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("sun");
		str.add("mon");
		str.add("sun");
		str.add("tue");
		str.add("wed");
		str.add("mon");

		System.out.println("Orignal : " + str);

		HashSet<String> hs = new HashSet<String>(str);

		System.out.println("Unique Elements: " + hs);

	}

}
/*
 * There is arraylist of strings al { “sun” , “mon” ,”sun” , “tue” , “wed” ,
 * “mon” } Create another arraylist al2 which contains unique elements from al
 * .So al2 will be {“sun” , “mon” , “tue”, “wed” }.
 */