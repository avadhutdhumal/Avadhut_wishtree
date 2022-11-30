package assignment_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayList_Map {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Nasik");
		al.add("Pune");
		al.add("Kolhapur");
		al.add("Sangali");

		HashMap<String, Integer> hs = new HashMap<String, Integer>();

		for (String s : al)
		{
			if (hs.containsKey(s))
			{
				hs.put(s, hs.get(s) + 1);
			} 
			else
			{
				hs.put(s, 1);
			}

		}

		for (Map.Entry<String, Integer> en : hs.entrySet()) {
			System.out.println(en.getKey() + "    " + en.getValue());
		}

	}

}
