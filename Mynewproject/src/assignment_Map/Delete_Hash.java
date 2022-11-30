package assignment_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Delete_Hash {

	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(5, "Cooker");
		hs.put(6, "Mixer");
		hs.put(2, "Oven");
		hs.put(1, "Fridge");
		hs.put(3, "Iorn");
		hs.put(4, "Gas");
		
		System.out.println("Delete Item From Map");
		for (Entry<Integer, String> en : hs.entrySet()) {
			System.out.println(en.getKey() + "    " + en.getValue());
		}

		Scanner sc = new Scanner(System.in);

		Set<Entry<Integer, String>> se = hs.entrySet();
		Iterator<Entry<Integer, String>> it = se.iterator();
		
		System.out.println("\nEnter Item To Delete: ");
		String item = sc.next();
		
		while (it.hasNext())
		{
			Entry<Integer, String> en = it.next();
			if (en.getValue().equalsIgnoreCase(item))
			{
				it.remove();
			}

		}
		
		for (Entry<Integer, String> en : hs.entrySet()) {
			System.out.println(en.getKey() + "    " + en.getValue());
		}
		
	}
}
