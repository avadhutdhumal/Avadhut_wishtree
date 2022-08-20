package contineu;
import java.util.Scanner;
public class Library {
	
	int bid, price;
	String bname, aname,rt;

		void acceptdetails()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Id ");
		bid=sc.nextInt();
		System.out.println("Enter Book Name"); 
		bname=sc.next(); 
		System.out.println("Enter Book Author Name ");
		aname=sc.next();
		System.out.println("Give Rating :: EXCELLENT :: GOOD :: AVERAGE ::BAD");
		rt=sc.next();
		sc.close();
		}
		

		void showdetails()
		{
		System.out.println(" Book Id: "+bid); 
		System.out.println(" Book Name: "+bname);
		System.out.println(" Book Author: "+aname);
		System.out.println("Book Rating: " +rt);
		}
		
		

		public static void main(String[] args) {
			
		Library b=new Library();
		b.acceptdetails();
		b.showdetails();

	}

}
