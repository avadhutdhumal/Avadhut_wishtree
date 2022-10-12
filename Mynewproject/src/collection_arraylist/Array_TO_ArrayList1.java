package collection_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_TO_ArrayList1 {

	public static void main(String[] args) {

		Integer[] arr = { 10, 63, 58, 79, 25, 14, 45 };

		List<Integer> al = new ArrayList<Integer>();

		//Using Collection.addAll method
		Collections.addAll(al, arr);

		System.out.println(al);

	}

}
