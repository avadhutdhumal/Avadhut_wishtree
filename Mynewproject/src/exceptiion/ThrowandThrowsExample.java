package exceptiion;
import java.util.InputMismatchException;
import java.util.Scanner;

class Student
{
	String name;
	Scanner sc = new Scanner (System.in);
	public void acceptName() throws InputMismatchException
	{
		System.out.println("Enter Name");
		name = sc.nextLine();
		if(name.length() <3)
			throw new InputMismatchException("Name must be "
					+ "minimun 3 chars lengthy");
		
		System.out.println("You have entered :"+name);
	}
}

public class ThrowandThrowsExample
{
	public static void main(String []sa)
	{
		Student s = new Student();
		try
		{
		s.acceptName();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
