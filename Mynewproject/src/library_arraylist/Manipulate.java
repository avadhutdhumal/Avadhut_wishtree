package library_arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Manipulate {
//	int bid;
//	String name;
//	int price;
//	String author_name;
	
	Manipulate()
	{
		Book b1 = new Book(111, "Speak   ", 450, "L.Anderson");
		Book b2 = new Book(222, "Natrang ", 270, "Anand Yadav");
		Book b3 = new Book(333, "Ghosted ", 500, "Rosie Walsh");
		Book b4 = new Book(444, "Twilight", 500, "Stephenie Meyer");
		Book b5 = new Book(555, "Arranged", 500, "Catherine McKenzie");

		ArrayList<Book> ak = new ArrayList<Book>();
		ak.add(b1);
		ak.add(b2);
		ak.add(b3);
		ak.add(b4);
		ak.add(b5);

		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n*****-----Welcome To Library----****");
		System.out.println("--------------------------------------");
		System.out.println("----------Make Your Choice----------");
		System.out.println("1.Add");
		System.out.println("2.Show");
		System.out.println("3.Delete");
		System.out.println("4.Update");
		System.out.println("5.Exit");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: 
		System.out.println("Enter Book id: ");
		int id=sc.nextInt();
		System.out.println("Enter Book name: ");
		String name=sc.next();
		System.out.println("Enter Book Price: ");
		int price=sc.nextInt();
		System.out.println("Enter Book Auther: ");
		String auther=sc.next();
		Book b6 = new Book(id, name, price, auther);
		ak.add(b6);
		break;
		
		case 2: 
			System.out.println("-----Showing Book Information-----\n");
			Iterator<Book> it = ak.iterator();

			while (it.hasNext()) {
				Book b = it.next();
				System.out.println(b.b_id + "  " + b.name + "  " + b.price + "  " + b.author_name);
			}
				break;
			
		case 3:
			System.out.println("Enter The Book Name To Delete");
			String bn=sc.next();
			if(bn.equalsIgnoreCase("Speak"))
			{
				ak.remove(b1);
			}
			
			else if(bn.equalsIgnoreCase("Natrang"))
			{
				ak.remove(b2);
			}
			
			else if(bn.equalsIgnoreCase("Ghosted"))
			{
				ak.remove(b3);
			}
			
			else if(bn.equalsIgnoreCase("Twilight"))
			{
				ak.remove(b4);
			}
			
			
			else if(bn.equalsIgnoreCase("Arranged"))
			{
				ak.remove(b5);
			}
			
			else
			{
				System.out.println("Invalid Choice");
			}
			
			break;
		
		case 4:
			System.out.println("Enter The Book Name To Update");

			String up=sc.next();
			if(up.equalsIgnoreCase("Speak"))
			{
				System.out.println("Old Price: "+b1.price);
				System.out.println("Enter New Price: ");
				price=sc.nextInt();
				Book b11=new Book(b1.b_id, b1.name,price,b1.author_name);
				ak.remove(b1);
				ak.add(b11);
			}
			
			else if(up.equalsIgnoreCase("Natrang"))
			{
				System.out.println("Old Price: "+b2.price);
				System.out.println("Enter New Price: ");
				price=sc.nextInt();
				Book b22=new Book(b2.b_id, b2.name,price,b2.author_name);
				ak.remove(b2);
				ak.add(b22);
			}
			
			else if(up.equalsIgnoreCase("Ghosted"))
			{
				System.out.println("Old Price: "+b3.price);
				System.out.println("Enter New Price: ");
				price=sc.nextInt();
				Book b33=new Book(b3.b_id, b3.name,price,b3.author_name);
				ak.remove(b3);
				ak.add(b33);
			}
			
			else if(up.equalsIgnoreCase("Twilight"))
			{
				System.out.println("Old Price: "+b4.price);
				System.out.println("Enter New Price: ");
				price=sc.nextInt();
				Book b44=new Book(b4.b_id, b4.name,price,b4.author_name);
				ak.remove(b4);
				ak.add(b44);
			}
			
			else if(up.equalsIgnoreCase("Arranged"))
			{
				System.out.println("Old Price: "+b5.price);
				System.out.println("Enter New Price: ");
				price=sc.nextInt();
				Book b44=new Book(b5.b_id, b5.name,price,b5.author_name);
				ak.remove(b4);
				ak.add(b44);
			}
			
			else 
			{
				System.out.println("No Book Avlilable");
			}
			
			break;
		
		case 5:	
		System.out.println("------------***********-----------");
		System.out.println("---THANK YOU FOR VISITING OUR LIBRARY---");
		System.out.println("------------***********-----------");
		System.exit(0);
	break;
	}
	
}while(true);
	}
}
