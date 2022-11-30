package library_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class LibMain {

	public static void main(String[] args) {
		String cc;
		Password p = new Password();
		Manipulate m = new Manipulate();
		p.welcome();
		do {
			System.out.println("\n*****-----Welcome To Library----****");
			System.out.println("--------------------------------------");
			System.out.println("----------Make Your Choice----------");
			System.out.println("1.Add Book");
			System.out.println("2.Show Books");
			System.out.println("3.Delete Book");
			System.out.println("4.Update Book Price");
			System.out.println("5.Search Book");
			System.out.println("6.Exit");
			Scanner sc = new Scanner(System.in);
//		ArrayList<Book> ak = new ArrayList<Book>();
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				m.add();
				break;

			case 2:
				m.show();
				break;

			case 3:
				m.delete();
				break;

			case 4:
				m.update();
				break;

			case 5:
				m.searchBook();
				break;

			case 6:
				m.exit();
				break;

			default:
				System.out.println("Invalid Entry");
			}

			System.out.println("=========================================");
			System.out.println("Do You Want To Another Operation");
			cc = sc.next();
		} while (cc.equalsIgnoreCase("yes"));
		System.out.println("***************Thank You*****************");

	}
}
