package written_Test1;

import java.util.*;
import java.util.Map.Entry;

/*
 * 3.	An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on
 * . Create a map which has alphabets as keys and integers as values.
 *  If alphabet is repeated add integer to old value.[2M]*/
public class Ques3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		al.add("DD+9");
		HashMap<String, String> hs = new HashMap<String, String>();
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String s = it.next();
			String[] k = s.split("\\+");

			for (int i = 0; i < k.length; i++) {
				String a = k[0];
				String b = k[1];
				hs.put(a, b);
			}
		}
		Set<Entry<String, String>> ent = hs.entrySet();

		Iterator<Entry<String, String>> it2 = ent.iterator();
		while (it2.hasNext()) {
			Entry<String, String> en = it2.next();
			System.out.println(en.getKey() + "  " + en.getValue());
		}
	}

}
