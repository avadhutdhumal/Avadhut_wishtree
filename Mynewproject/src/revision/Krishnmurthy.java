package revision;

import java.util.Scanner;
public class Krishnmurthy {

	public static void main(String[] args) {
		
		          Scanner sc = new Scanner(System.in);
		          int num;
		          System.out.println("Enter any number:");
		          num= sc.nextInt();
		          int m = num;
		          int sum = 0;
		          while (num>0)
		          {
		               int d= num%10;
		               int fact = 1; 
		               for (int i= 1; i<= d; i++) 
		                    fact = fact * i;
		               sum = sum + fact;
		               num=num/ 10;
		          }
		          
		          if ( sum == m)
		               System.out.println ("Yes! Number is Krishnmurthy");
		          else
		               System.out.println ("No number is not Krishnmurthy");
		          sc.close();
	}

}
