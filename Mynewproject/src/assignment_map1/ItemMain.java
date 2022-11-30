package assignment_map1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ItemMain {

	public static void main(String[] args) {

		Supplier s1 = new Supplier(111, "Suraj", "Kolhapur");
		Supplier s2 = new Supplier(222, "Suhas", "Sangali");
		Supplier s3 = new Supplier(333, "Ganesh", "Miraj");

		ArrayList<Supplier> al1 = new ArrayList<Supplier>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);

		Item i1 = new Item(101, "Bulb", 100, s1);
		Item i2 = new Item(201, "Pen", 250, s2);
		Item i3 = new Item(301, "Motor", 350, s3);
		Item i4 = new Item(301, "Ruler", 90, s1);
		Item i5 = new Item(301, "Chalk", 120, s2);
		Item i6 = new Item(301, "Map", 60, s3);

		ArrayList<Item> al2 = new ArrayList<Item>();
		al2.add(i1);
		al2.add(i2);
		al2.add(i3);
		al2.add(i4);
		al2.add(i5);
		al2.add(i6);

		HashMap<Item, Supplier> hs = new HashMap<Item, Supplier>();
		hs.put(i1, s1);
		hs.put(i2, s2);
		hs.put(i3, s3);
		hs.put(i4, s1);
		hs.put(i5, s2);
		hs.put(i6, s3);

		System.out.println("Iterating All Entries");
		System.out.println("======================");

		Set<Entry<Item, Supplier>> set = hs.entrySet();

		for (Entry<Item, Supplier> map : set) {
			Item i = map.getKey();
			Supplier sp = map.getValue();

			System.out.println(sp.s_id + "  " + sp.s_name + "   " + sp.location);
			System.out.println(i.i_id + "   " + i.i_name + "    " + i.price);
		}

		System.out.println("\nShowing Item Price>200");
		System.out.println("======================");
		for (Entry<Item, Supplier> map : set) {
			Item i = map.getKey();
			if (i.price > 200) {
				System.out.println(i.i_id + "   " + i.i_name + "    " + i.price);
			}
		}

		System.out.println("\nShowing Details Of Suraj");
		System.out.println("======================");
		for (Entry<Item, Supplier> map : set) {
			Item i = map.getKey();
			Supplier sp = map.getValue();
			if (sp.s_name.equalsIgnoreCase("Suraj")) 
			{
				System.out.println(sp.s_id + "  " + sp.s_name + "   " + sp.location);
				System.out.println(i.i_id + "   " + i.i_name + "    " + i.price);
			}
		}
			
		HashMap<String,Item> hss = new HashMap<String,Item>();
		
		hss.put("Suraj", i1);
		hss.put("Ganesh",i2);
		hss.put("Suhas", i3);
		Set<Entry<String, Item>> set1 = hss.entrySet();
		System.out.println("\nShowing Item Details With<String,Item>");
		System.out.println("=========================");
		for (Entry<String,Item> map1 : set1) {
			
			Item ii  = map1.getValue();
			if(map1.getKey().equals("Ganesh")) {
			System.out.println(ii.i_id + "   " + ii.i_name + "    " + ii.price);
			}
			}
		
		
		
		
	}
}
