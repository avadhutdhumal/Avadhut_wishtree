package collection_arraylist;

import java.util.ArrayList;

public class Arraylist_TO_Array2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(80);
		al.add(87);
		al.add(12);
		al.add(42);
		al.add(74);
		// ArrayList to Array
		// using toArray Method
		Integer[] arr = new Integer[al.size()];

		arr = al.toArray(arr);

		for (Integer j : arr)
			System.out.print(j + " ");
	}

}
