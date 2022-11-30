package library_arraylist;

import java.util.Scanner;

public class Password {
	
	String u_name="avadhutd";
	String pass="12345";

	void welcome()
	{
		int count=0;
		while(count<3)
		{
		
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Username: ");
	String uname=sc.next();
	System.out.println("Enter Password: ");
	String passw=sc.next();
	
	if(uname.equals(u_name) && passw.equals(pass))
	{
		Manipulate m1=new Manipulate();
		break;
	}
	else
	{
		count++;
		if(count<3)
		{
			System.out.println("Please Enter Correct Username and Password");
		}
		
		else
		{
			System.out.println("Sorry! You Have Accessed Max Limit");
			System.exit(0);
		}
	}
		}
	}
}
