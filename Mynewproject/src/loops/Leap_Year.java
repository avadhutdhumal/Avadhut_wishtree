package loops;
import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args) {
		int year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year:");
		year=sc.nextInt();
		
		if ((year%400==0) || ((year%4==0) && (year%100!=0)))
		{
			System.out.println("This year is leap year");
		}
		else
		{
			System.out.println("This year not leap year");
		}
			sc.close();
	}

}
