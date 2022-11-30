package hashset;

import java.util.HashSet;

public class hashset1 {

	public static void main(String[] args) {
		HashSet<Integer> hss=new HashSet<Integer>();
		hss.add(10);
		hss.add(67);
		hss.add(62);
		hss.add(45);
		hss.add(87);
		hss.add(67);
		
		System.out.println(hss);
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(75);
		hs.add(44);
		
		hss.addAll(hs);
		System.out.println(hss);
		
		hss.removeAll(hs);
		System.out.println(hss);
		
 	}

}
