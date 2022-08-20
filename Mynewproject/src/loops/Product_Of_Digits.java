package loops;
import java.util.Scanner;
public class Product_Of_Digits {

	public static void main(String[] args) {
		int i;
		int product=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any digit");
		i=sc.nextInt();
		
		while(i>0)
			
		{
		int m=i%10;
		product=product*m;
		i=i/10;
		}
		
		System.out.println("The product is :"+product);
		sc.close();
	}
	

}
