package revision;
import java.util.Scanner;
public class Sum_Alternate {

	public static void main(String[] args) {
		int sum = 0;
		int digit;
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		while(num>0)
		{
			digit=num%10;
			flag++;
			
			if(flag %2==0)
			sum=sum+digit;
			num=num/10;
		}
	
		System.out.println("The Sum is: "+sum);
		sc.close();
	}
}
