package program_Library;

import java.util.Scanner;

public class StudentInformation {
	int id;
	Book b[];
	int x;

	int flag = 0;
	int k;

	void showing_dep(Book b[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------------------");
		System.out.println("**************|| WELCOME TO LIBRARY ||******************");
		System.out.println("--------------------------------------------------------");
		System.out.println("DEPARTMENTS AVILABLE IN LIBRARY");
		System.out.println("1.IT");
		System.out.println("2.Mechanical");
		System.out.println("3.ELectrical");

		System.out.println("\nPLEASE ENTER DEPARTMENT:");
		String dep = sc.next();
		for (int i = 0; i < b.length; i++) {
			if (dep.equalsIgnoreCase(b[i].getD().getD_name())) {
				System.out.println(b[i].b_id + " " + b[i].b_name + "     " + b[i].author + "    " + b[i].price + "  "
						+ b[i].no_of_copies);
			}
		}

		System.out.println("\nPlease Enter Book Name: ");
		String b_name = sc.next();

		availibitity(b, b_name);
		student_info(b);

	}

	void availibitity(Book b[], String b_name) {

		for (k = 0; k < b.length; k++) {
			if (b[k].b_name.equalsIgnoreCase(b_name) && b[k].no_of_copies > 0) {
//				b[k].b_name.equalsIgnoreCase(b_name)
				flag = 1;
				x = b[k].getNo_of_copies();
				break;
				// System.out.println("------"+x);

			}
		}

		if (flag == 1 && x != 0) {
			System.out.println("Selected Book: "+b_name + "\nStatus: Avilable");
			x--;
//			System.out.println(k);
			b[k].setNo_of_copies(x);
		}

		else if( x == 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Status: Not Avilable");
			System.out.println("Do you Want Book From Other Department ");
			String ch1 = sc.nextLine();
			if(ch1.equalsIgnoreCase("Yes"))
			{
			showing_dep(b);
			}
			
			else{
				System.exit(0);
			    }
		}
		
		
		}

	static void student_info(Book b[]) {

		Student s[] = new Student[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Do You Want To Issue Book:");
		String ch = sc.nextLine();

		if (ch.equalsIgnoreCase("yes")) {
//			for (int i = 0; i < s.length; i++) {

				System.out.println("Enter Student ID: ");
				int id = sc.nextInt();
				System.out.println("Enter Name: ");
				String name = sc.next();
				System.out.println("Enter Mobile Number: ");
				String mob = sc.next();

				Student ss = new Student();
				ss.setS_id(id);
				ss.setS_name(name);
				ss.setMob(mob);

				System.out.println("Student ID: " + id + " " + "Student Name: " + name + " " + "Student Mobile: " + mob);

				book_print(b);
				Date1 p = new Date1();
				p.issueDate();
//			}
		} 
		else {
			System.exit(0);
			
		}

	}

	static void book_print(Book[] b) {
		int i = 0;
		System.out.println("*****************BOOK ISSUED*****************");
		System.out.println("Book Id: " + b[i].b_id + " " + "\n" + "Book Name: " + b[i].b_name + " " + "\n"
				+ "Author Name: " + b[i].author + " " + "\n" + "Book Price: " + b[i].price);
		System.out.println("*********************************************");
	}
}
