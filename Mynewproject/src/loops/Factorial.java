package loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int fact=1;
		System.out.println("Enter your number :");
		int num=sc.nextInt();
		for(int i=num;i>=1;i--)
		{
			fact=i*fact;
		}
		System.out.println("The factorical of your number is :" +fact);
		sc.close();
	}

}
