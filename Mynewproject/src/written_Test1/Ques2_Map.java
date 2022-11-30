package written_Test1;

import java.util.*;
import java.util.Map.Entry;

/*2.	An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a method which accepts a character String eg D in input and will return associated
 *  number value eg in this case 4 by looping the arraylist and finding matching pattern [1M]
 */
public class Ques2_Map {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
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
		System.out.println("Enter Charater: ");
		String c = sc.next();
		Set<Entry<String, String>> ent = hs.entrySet();
		Iterator<Entry<String, String>> it1 = ent.iterator();
		while (it1.hasNext()) {
			Entry<String, String> en = it1.next();

			if (en.getKey().equalsIgnoreCase(c)) {
				System.out.println("Integer For Character Is: "+en.getValue());
			}
		}

	}
}