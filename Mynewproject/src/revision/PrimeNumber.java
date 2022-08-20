package revision;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		for(;;)
	{
			int num,flag=0;
		System.out.println("Enter Number: ");
		num=sc.nextInt();
		
		for(int i=2; i<num/2; i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}	
			if(flag==1)
			{	
				System.out.println(num+ " Is Not Prime Number");
			}
			else
			{
				System.out.println(num+ " Is Prime Number "); 
			}
			
			if(num<0)
			{
				break;
			}
			
		}	
	}
}	
