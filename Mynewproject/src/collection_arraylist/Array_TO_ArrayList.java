package collection_arraylist;

import java.util.Arrays;
import java.util.List;

public class Array_TO_ArrayList {

	public static void main(String[] args) {

		Integer [] arr= { 12,18,45,25,99};

// Conversion of array to ArrayList
// using Arrays.asList
		List<Integer> al = Arrays.asList(arr);

		System.out.println(al);
	}

}
