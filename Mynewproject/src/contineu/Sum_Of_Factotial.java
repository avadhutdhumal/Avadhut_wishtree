package contineu;
import java.util.Scanner;
public class Sum_Of_Factotial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range : ");
		int num=sc.nextInt();
		int total=0;
		int i=1;
				
		while(i<=num) 
		{
			int factorial=1;
			int j=1;
					
				while(j<=i) 
					{
						factorial=factorial*j;
						j = j+1;
					}
					total=total+factorial;
					i=i+1;
				}
				System.out.println("Sum of factorial is: " + total);
				sc.close();
			}
	
	}


