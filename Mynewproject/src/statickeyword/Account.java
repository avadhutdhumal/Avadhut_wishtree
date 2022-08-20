package statickeyword;

public class Account {
	
	long accountNo;
	String customerName;
	
	Account()
	{
		System.out.println("I am default constructor");
	}
	
	Account(long accountNo,String customerName)
	{
		this.accountNo=accountNo;
		this.customerName=customerName;
		System.out.println("I am in parameterized constructor");
	}
	
	void display()
	{
		System.out.println("Account Number:  "+accountNo+  "   "+"Customer Nmae: "+customerName);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Account a=new Account();
		Account a1=new Account(12345, "Krishna Patil");
		a1.display();
		Account a2=new Account(34647, "Akash Gavali");
		a2.display();
		
	}

}
