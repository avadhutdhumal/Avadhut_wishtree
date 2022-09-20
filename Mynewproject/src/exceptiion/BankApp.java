package exceptiion;
public class BankApp {
	public static void main(String[] args) 
	{
		Account obj = new Account(4000.00f, "dssaf", 1212112321);
		System.out.println(obj);
		
			obj.withdraw(2000);
			obj.withdraw(1500);
		
		
		System.out.println(obj);
	}
}
