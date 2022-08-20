package loops;
import java.util.Scanner;
public class Max_Digit_In_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,rem;
		int max=0;
		System.out.println("Enter your number");
		num=sc.nextInt();
		
		
		while(num>0)
		{
			rem=num%10;
			if (max<rem)
			{
				max=rem;
			}
			num=num/10;
		}
			System.out.println("Largest Digit is : "+max);
			sc.close();
	}
}
