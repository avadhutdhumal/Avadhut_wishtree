package assignment_Diwali;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Showroom_Main {

	public static void main(String[] args) {
		Car c1 = new Car(1111, "Alto", 300000, 4.0f);
		Car c2 = new Car(9659, "Tiago", 500000, 4.8f);
		Car c3 = new Car(4965, "Swift", 600000, 4.6f);
//		Car c4 = new Car(6255, "Toyota", 650000, 5.0f);
		Car c5 = new Car(2854, "Figo", 350000, 3.9f);
		Car c7 = new Car(7054, "WagonR", 550000, 4.3f);

		Showroom s1 = new Showroom("TATA  ", "Pune", c2);
		Showroom s2 = new Showroom("MARUTI", "Thane", c3);
		Showroom s3 = new Showroom("FORD  ", "Goa", c5);
		Showroom s4 = new Showroom("MARUTI", "Kolhapur", c7);
		Showroom s5 = new Showroom("MARUTI", "Pune", c1);

		ArrayList<Showroom> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		HashMap<String, ArrayList<Showroom>> hmm = new HashMap<String, ArrayList<Showroom>>();
		Iterator<Showroom> itt = al.iterator();
		while (itt.hasNext()) {
			Showroom s = itt.next();
			if (hmm.containsKey(s.c.c_name)) {
				ArrayList<Showroom> al1 = hmm.get(s.c.c_name);
				al1.add(s);
				hmm.put(s.c.c_name, al1);
			}

			else {
				ArrayList<Showroom> al1 = new ArrayList<Showroom>();
				al1.add(s);
				hmm.put(s.c.c_name, al1);
			}
		}
//		hmm.put("Swift ", al);
//		hmm.put("Tiago ", al);
//		hmm.put("Alto  ", al);
//		hmm.put("WagonR", al);
//		hmm.put("Figo  ", al);
//		System.out.println(hmm);

		Set<Entry<String, ArrayList<Showroom>>> se = hmm.entrySet();

		for (Entry<String, ArrayList<Showroom>> map : se) {
			String s = map.getKey();
			ArrayList<Showroom> ss = map.getValue();
			Iterator<Showroom> et = ss.iterator();
			while (et.hasNext()) {
				Showroom p = et.next();
				System.out.println("Car: " + s + "  " + "ShowRoom: " + p.s_name + "    " + p.s_location);
			}
//			System.out.println("Car: " + s + "  " + "ShowRoom: " + p.s_name+ "    " + p.s_location);
//			System.out.println("Car: " + s + "  " + "ShowRoom: " + ss.s_name + "    " + ss.s_location);
		}

	}

}
