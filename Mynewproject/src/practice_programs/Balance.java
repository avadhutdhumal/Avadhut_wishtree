package practice_programs;

import java.util.InputMismatchException;
import java.util.Scanner;

class Bank{
	int bal=5000;
	Scanner sc =new Scanner(System.in);
	
	void transact() throws InputMismatchException 
	{
	System.out.println("Enter Withdraw amount");
	int amt=sc.nextInt();
	
	bal=bal-amt;
	if(amt>bal) 
		throw new InputMismatchException("Insufficient balance");
	else 
	System.out.println("Please Collect Cash");
	System.out.println("Balance is" +bal);
	}
}
public class Balance {
	
	
	public static void main(String[] args) {
		
		Bank b= new Bank();
		try {
		b.transact();
		}
		
		catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Please Withdraw Limited amount");		}
	}

}
