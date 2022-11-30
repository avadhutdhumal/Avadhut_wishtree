package written_Test1;

import java.util.*;

public class Ques1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tickets = 2;
		int count = 0;
		for (int i = 0; i<3; i++) 
		{
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Enter ID: ");
			String id=sc.next();
			tickets--;
			count++;
			System.out.println("Congratulations You Got Ticket" + name);

			System.out.println("Enter Name");
			String name1 = sc.next();
			System.out.println("Enter ID: ");
			String id1=sc.next();

			if (name.equalsIgnoreCase(name1) && id.equalsIgnoreCase(id1))
			{
				System.out.println("Sorry You have already Puchased Ticket");
				System.exit(0);
				
			} 
			else {
				tickets--;
				System.out.println("Congratulations You Got Ticket " + name1);
			
			}
			break;
		}

	}
}