package assignment_17Sept;

import java.util.Scanner;

@SuppressWarnings("serial")
class Low_Balance_Exception extends Exception {
	int bal = 5000;
	Scanner sc = new Scanner(System.in);
	private String str;

	public Low_Balance_Exception(String str) {
		this.str = str;
	}

	public String toString() {
		return ("Sorry We Cannot Proceed : " + str);
	}

	void transact() throws Low_Balance_Exception
	{
		System.out.println("Enter Withdraw amount");
		int amt = sc.nextInt();

		bal = bal - amt;
		if (bal-amt <1000)
			throw new Low_Balance_Exception("Please Withdraw Limited Amount ");
		else
			System.out.println("Please Collect Cash");
		System.out.println("Balance is: " + bal);
	}
}

public class Balance_Exception {

	public static void main(String[] args) throws Low_Balance_Exception {

		Low_Balance_Exception l = new Low_Balance_Exception("Exception");
		try {
			l.transact();
		}

		catch (Low_Balance_Exception e) {
			System.out.println(e);
		}

	}

}
