package loops;
import java.util.Scanner;
public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num,rem;
		int result=0;
		System.out.println("Enter Number:");
		num=sc.nextInt();
		
		int arm=num;
		while(arm>0)
			
		{
			rem=arm%10;
			result=result+(rem*rem*rem);
			arm=arm/10;
		}
		if (num==result)
		{
			System.out.println("This is armstrong number");
		}
		else
		{
			System.out.println("This is not armstrong number");
		}
		sc.close();
	}

}
