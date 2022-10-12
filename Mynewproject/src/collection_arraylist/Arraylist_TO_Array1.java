package collection_arraylist;

import java.util.ArrayList;

public class Arraylist_TO_Array1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(80);
		al.add(87);
		al.add(12);
		al.add(42);
		al.add(74);

		int [] arr = new int [al.size()];

		// ArrayList to Array 
		//Manual Method		
		for(int i = 0; i < al.size(); i++){ 
			arr[i] = al.get(i);
		}
		
		for (Integer j : arr)
			System.out.print(j + " ");
	}

}
