package assignment_Diwali;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class Car_Hashmap {
	public static void main(String[] args) {
		Car c1 = new Car(1111, "Alto", 300000, 4.0f);
		Car c2 = new Car(9659, "Tiago", 500000, 4.8f);
		Car c3 = new Car(4965, "Swift", 600000, 4.6f);
		Car c4 = new Car(6255, "Toyota", 650000, 5.0f);
		Car c5 = new Car(2854, "Figo", 350000, 3.9f);
		Car c7 = new Car(7054, "WagonR", 550000, 4.3f);
	
		HashMap<String, Float> hm = new HashMap<String, Float>();
		ArrayList<Car> al = new ArrayList<>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		al.add(c7);
		
		Iterator<Car> et=al.iterator(); 
		while(et.hasNext())
		{
			Car p=et.next();
			hm.put(p.c_name, p.rating);
		}
		
//		HashMap<String, Float> hm = new HashMap<String, Float>();
//		hm.put("Swift", 4.6f);
//		hm.put("WagonR", 4.3f);
//		hm.put("Tiago", 4.8f);
//		hm.put("Alto", 4.0f);
//		hm.put("Figo", 3.9f);

		System.out.println("========Iterating The HashMap=======");
		Set<Entry<String, Float>> hs = hm.entrySet();
		Iterator<Entry<String, Float>> it = hs.iterator();
		while (it.hasNext()) {
			Entry<String, Float> en = it.next();
			String s = en.getKey();
			Float f = en.getValue();
			System.out.println(s + "    " + f);

		}
		System.out.println("========Rating Greater Than 4=======");
		Set<Entry<String, Float>> ens = hm.entrySet();
		Iterator<Entry<String, Float>> it1 = ens.iterator();
		while (it1.hasNext()) {
			Entry<String, Float> enn = it1.next();
			String s = enn.getKey();
			Float f = enn.getValue();
			if (f > 4.0f) {
				System.out.println(s + "    " + f);
			}

		}

		TreeMap<String, Float> tm = new TreeMap<String, Float>(hm);
//			System.out.println(tm);
	
		System.out.println("========Sorting=======");
		NavigableMap<String, Float> n = tm.descendingMap();
		Set<Entry<String, Float>> hs1 = n.entrySet();
		Iterator<Entry<String, Float>> it9 = hs1.iterator();
		while (it9.hasNext()) {
			Entry<String, Float> en9 = it9.next();
			String s = en9.getKey();
			Float f = en9.getValue();
			System.out.println(s + "    " + f);

		}

	}
}
