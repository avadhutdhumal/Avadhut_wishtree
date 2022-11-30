package Written_Test2;
import java.util.*;
public class Ques9 {

	public static void main(String[] args) {
		
		String in = "Nothing is as easy as it looks Nothing";
		HashMap<String, Integer> hm = new HashMap<>();
		String[] ss = in.split(" ");

		for (String s : ss) {
			Integer i = hm.get(s);
			if (i ==null) 
			{
				hm.put(s, 1);
			} else {
				hm.put(s, i + 1);
			}
		}
		System.out.println(hm);
	}
}
