package assignment_Diwali;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Car_main {

	public static void main(String[] args) {

		Car c1 = new Car(1111, "Alto", 300000, 4.0f);
		Car c2 = new Car(9659, "Tiago", 500000, 4.8f);
		Car c3 = new Car(4965, "Swift", 600000, 4.6f);
		Car c4 = new Car(6255, "Toyota", 650000, 5.0f);
		Car c5 = new Car(2854, "Figo", 350000, 3.9f);
		Car c7 = new Car(7054, "WagonR", 550000, 4.3f);
		
		ArrayList<Car> al = new ArrayList<>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		al.add(c7);
		
		System.out.println("======Showing Car Details=======\n");
		Iterator<Car> it = al.iterator();
		while (it.hasNext()) {
			Car c = it.next();
			System.out.println(c.c_id + "    " + c.c_name + "    " + c.c_price + "    " + c.rating);
		}

		Iterator<Car> it1 = al.iterator();
		while (it1.hasNext()) {
			Car c = it1.next();
			if (c.c_name.equalsIgnoreCase("Toyota")) {
				it1.remove();
			}
		}

		System.out.println("\n======Removing Toyoto Car=======\n");
		Iterator<Car> it2 = al.iterator();
		while (it2.hasNext()) {
			Car c = it2.next();
			System.out.println(c.c_id + "    " + c.c_name + "    " + c.c_price + "    " + c.rating);
		}

		ListIterator<Car> li = al.listIterator();
		Car c6 = new Car(2246, "Alto", 400000, 4.0f);
		while (li.hasNext()) {
			Car cc = li.next();
			if (cc.c_name.equalsIgnoreCase("Alto")) {
				li.set(c6);
			}

		}
		System.out.println("\n======Updating Price=======\n");
		Iterator<Car> it3 = al.iterator();
		while (it3.hasNext()) {
			Car c = it3.next();
			System.out.println(c.c_id + "    " + c.c_name + "    " + c.c_price + "    " + c.rating);
		}
		
		Collections.sort(al);
		System.out.println("\n======Sorting On Price Decending=======\n");
		Iterator<Car> it4 = al.iterator();
		while (it4.hasNext()) {
			Car c = it4.next();
			System.out.println(c.c_id + "    " + c.c_name + "    " + c.c_price + "    " + c.rating);
		}
		
		Collections.sort(al, new Car_Rating());
		System.out.println("\n======Sorting On Rating Decending=======\n");
		Iterator<Car> it5 = al.iterator();
		while (it5.hasNext()) {
			Car c = it5.next();
			System.out.println(c.c_id + "    " + c.c_name + "    " + c.c_price + "    " + c.rating);
		}
		
		Collections.sort(al, new Car_Name());
		System.out.println("\n======Sorting On Names Ascending=======\n");
		for(Car c:al)
		{
			System.out.println(c.c_id + "    " + c.c_name + "    " + c.c_price + "    " + c.rating);
			}
	}

}
