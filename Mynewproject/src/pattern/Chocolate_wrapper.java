package pattern;
import java.util.Scanner;
public class Chocolate_wrapper {

	public static void main(String[] args) {
		
		int chocolate=0, wrapper=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Price: ");
		int price=sc.nextInt();
		
		for (int i=1;i<=price;i++)
		{
			chocolate++;
			wrapper++;
			if(chocolate%3==0)
			{
				if(wrapper%3==0)
				{
					chocolate=chocolate+1;
					wrapper++;
				}
			}	
		}	
		System.out.println("Total chocolates are: " +chocolate);
		sc.close();
	}

	}
