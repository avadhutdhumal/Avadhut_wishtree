package assignment_Diwali;

import java.util.*;

public class Customer_Main {

	public static void main(String[] args) {
		Customer c1 = new Customer(101, "Rajesh", "10/01/2020");
		Customer c2 = new Customer(201, "Yogesh", "24/11/2011");
		Customer c3 = new Customer(305, "Ramesh", "16/05/2017");
		Customer c4 = new Customer(408, "Suresh", "11/07/2009");
		Customer c5 = new Customer(575, "Disnesh", "31/08/2013");

		PriorityQueue<Customer> pq = new PriorityQueue<Customer>();
		pq.add(c1);
		pq.add(c2);
		pq.add(c3);
		pq.add(c4);
		pq.add(c5);
//		pq.offer(c2);

		Iterator<Customer> i1 = pq.iterator();
		while (i1.hasNext()) {
			Customer c = i1.next();
			System.out.println(c.c_id + "   " + c.c_name + "    " + c.d_of_account);

		}

		System.out.println("\n"+pq.poll().c_id + "  " + pq.poll().c_name + "   " + pq.poll().d_of_account);
	}

}
