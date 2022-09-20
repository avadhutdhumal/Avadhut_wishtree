
package assignment_03_Sept;

import java.util.Scanner;

public class Email_Valid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id: ");
		String a = sc.next();
		char c[] = a.toCharArray();
		int d = 0, e = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '@') {
				d++;
			}

			else if (c[i] == '.') {
				e++;
			}
		}

		if (d==1 && e > 0) {
			System.out.println("Valid Mail Id");
		} else {
			System.out.println("Invalid Mail Id");
		}
sc.close();
	}

}

//Accept email_id from user and check valid or not(should contain @.)