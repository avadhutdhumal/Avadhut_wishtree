package test1;

import java.util.*;
//import java.util.Collections;
//import java.util.List;

public class Testt1 {

	public static void main(String[] args) {

		Character arr[] = { 'a', 'd', 'c', 'm', 'd', 'a' };

		List<Character> ch = Arrays.asList(arr);
		HashSet<Character> hss = new HashSet<Character>(ch);

		Iterator<Character> it = hss.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

//		System.out.println(hss);
	}

}
