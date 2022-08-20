package revision;
import java.util.Scanner;
public class Guess_Number_Puzzle {

	public static void main(String[] args) {
		int result=25;
		int  num;
		Scanner sc =new Scanner(System.in);
		
		int count=0;
		do
		{
			System.out.println("GUESS THE NUMBER FROM 1 to 100");
			num=sc.nextInt();
			count++;
			
			if (num==result)
			{
				System.out.println("Congratulations! Your Guess Is Correct");
				System.out.println("Total Attempts: "+count);
				break;
			}

			else if(num<result)
			{
				System.out.println("You Have Entered Smaller Number..Please Enter Bigger Number");
			}
			
			else
			{
				System.out.println("You Have Entered Bigger Number..Please Enter Smaller Number");
			}
		}
		while(num>0);
sc.close();
	}

}
