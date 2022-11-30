package assignment_10_Oct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BookMain {

	public static void main(String[] args) {
		Book1 b1 = new Book1(111, "Speak   ", 450, "L.Anderson");
		Book1 b2 = new Book1(222, "Natrang ", 270, "Anand Yadav");
		Book1 b3 = new Book1(333, "Ghosted ", 500, "Rosie Walsh");
		Book1 b4 = new Book1(444, "Twilight", 500, "Stephenie Meyer");
		Book1 b5 = new Book1(555, "Arranged", 500, "Catherine McKenzie");

		ArrayList<Book1> ak = new ArrayList<Book1>();
		ak.add(b1);
		ak.add(b2);
		ak.add(b4);
		ak.add(b3);
		ak.add(b5);

		System.out.println("-----Showing Book Information-----\n");
		Iterator<Book1> it = ak.iterator();

		while (it.hasNext()) {
			Book1 b = it.next();
			System.out.println(b.b_id + "  " + b.name + "  " + b.price + "  " + b.author_name);
		}

		System.out.println("\n-----Sorting On Book Name-----\n");
		Collections.sort(ak, new BookName());
		for (Book1 b : ak) {
			System.out.println(b.b_id + "  " + b.name + "  " + b.price + "  " + b.author_name);
		}

		System.out.println("\n-----Sorting On Price-----\n");
		Collections.sort(ak, new BookPrice());
		for (Book1 b : ak) {
			System.out.println(b.b_id + "  " + b.name + "  " + b.price + "  " + b.author_name);
		}

		System.out.println("\n-----Sorting On Price-----\n");
		Collections.sort(ak, new BookAuthor());
		for (Book1 b : ak) {
			System.out.println(b.b_id + "  " + b.name + "  " + b.price + "  " + b.author_name);
		}
	}

}
