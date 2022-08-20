package switchcase;
import java.util.Scanner;
public class Atm_Transaction {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int balance=1000, withdraw,deposite;
		while(true)
		{
			System.out.println("Welcome To ATM");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("Choose option: ");
			int n=sc.nextInt();
			
		switch(n)
		{
		case 1:
			System.out.println("Enter amount you want to withdraw: ");
			withdraw=sc.nextInt();
			if(balance>=withdraw)
			{
				balance=balance-withdraw;
				System.out.println("Please Collect Your Money");
				System.out.println("Your remaining balance is: " +balance);
			}
				else
				{
				System.out.println("Sorry Insufficient Balance");
				System.out.println("Your remaining balance is: " +balance);
				}		
				break;
		
		case 2:
			System.out.println("Enter amount you want to deposite: ");
			deposite=sc.nextInt();
			balance=balance+deposite;
			System.out.println("Sucessfully Deposited");
			//System.out.println("");
			break;
			
		case 3:
			System.out.println("Your total balance is: " +balance);
		    break;
		case 4:
			System.exit(0);	
			sc.close();
		}	
			
		}
	}
}
