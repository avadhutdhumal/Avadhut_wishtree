package library_arraylist;

import java.util.*;

public class Manipulate {
	int check;
	ArrayList<Book> ak = new ArrayList<Book>();

	Manipulate() {
		Book b1 = new Book(111, "Speak", 450, "L.Anderson");
		Book b2 = new Book(222, "Natrang", 270, "Anand Yadav");
		Book b3 = new Book(333, "Ghosted", 500, "Rosie Walsh");
		Book b4 = new Book(444, "Twilight", 500, "Stephenie Meyer");
		Book b5 = new Book(555, "Arranged", 500, "Catherine McKenzie");

		ak.add(b1);
		ak.add(b2);
		ak.add(b3);
		ak.add(b4);
		ak.add(b5);
	}

	Scanner sc = new Scanner(System.in);

	void add() {
		System.out.println("Enter Book id: ");
		int id = sc.nextInt();
		System.out.println("Enter Book name: ");
		String name = sc.next();
		System.out.println("Enter Book Price: ");
		int price = sc.nextInt();
		System.out.println("Enter Book Auther: ");
		String auther = sc.next();
		Book b6 = new Book(id, name, price, auther);
		ak.add(b6);

		show();
	}

	void show() {

		System.out.println("-----Showing Book Information-----\n");
		Iterator<Book> it = ak.iterator();

		while (it.hasNext()) {
			Book b = it.next();
			System.out.println(b.b_id + "  " + b.name + "  " + b.price + "  " + b.author_name);
		}
	}

	void delete() {

		System.out.println("Enter The Book Name To Delete");
		String bn = sc.next();

		Iterator<Book> it1 = ak.iterator();

		while (it1.hasNext()) {
			Book b = it1.next();
			if (b.name.equalsIgnoreCase(bn)) {
				it1.remove();
			}
		}

		show();
	}
//			

	void update() {
		System.out.println("Enter The Book Name To Update");

		String up = sc.next();
//				String price1=sc.next();
		ListIterator<Book> li = ak.listIterator();
		while (li.hasNext()) {
			Book b = li.next();
			if (b.name.equalsIgnoreCase(up)) {
				System.out.println("Old Price: " + b.price);
				System.out.println("Enter New Price: ");
				int price = sc.nextInt();
				Book b11 = new Book(b.b_id, b.name, price, b.author_name);
				li.set(b11);
			}
		}
		show();
	}

	public void searchBook() {
		System.out.println("Enter Book Name ");
		String sb = sc.next();

		Iterator<Book> it2 = ak.iterator();

		while (it2.hasNext()) {
			Book b = it2.next();
			if (b.name.equalsIgnoreCase(sb)) 
					{
				check = 1;
				if (check == 1) {
					System.out.println("Book Is Avilable");
					System.out.println("----------------");
					System.out.println("Book ID: "+b.b_id);
					System.out.println("Book Name: "+b.name);
					System.out.println("Book Auther: "+b.author_name);
					System.out.println("Book Price: "+b.price);
				}
				else
				{
					System.out.println("Book Not Ailavle");
				}
			}

		}
	}

	void exit() {
		System.out.println("------------***********-----------");
		System.out.println("---THANK YOU FOR VISITING OUR LIBRARY---");
		System.out.println("------------***********-----------");
		System.exit(0);
	}
}
