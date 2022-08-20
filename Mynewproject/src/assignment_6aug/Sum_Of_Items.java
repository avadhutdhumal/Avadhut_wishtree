package assignment_6aug;
import java.util.Scanner;
public class Sum_Of_Items {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item Number: ");
		int num=sc.nextInt();
		int total = 0;
		for(int i=1; i<=num; i++)
		{
			total=total+i;
		}
		
		System.out.println(+total);
		sc.close();
	}
}
