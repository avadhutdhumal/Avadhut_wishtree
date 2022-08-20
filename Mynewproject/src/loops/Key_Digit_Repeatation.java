package loops;
import java.util.Scanner;
public class Key_Digit_Repeatation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,key,i;
		int m = 0;
		System.out.println("Enter your number: ");
		num=sc.nextInt();
		System.out.println("Enter key digit: ");
		key=sc.nextInt();
		
		while(num>0)
		{
			
			i=num%10;
			if(i==key)
			{
				m++;
			}
			num=num/10;
			
		}
		System.out.println("Your key digit repeat is " + m + " times.");
		sc.close();
	}

}
