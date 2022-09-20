package exceptiion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CodeWithExceptionHandling {

	public static void main(String[] args) {
	
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of a : ");
		int a = sc.nextInt();

		System.out.println("Enter Value of b : ");
		int b = sc.nextInt();
		
		float c = a/b;
		System.out.println("Division is : " + c);
		System.out.println("Addition is : " + (a+b));
		System.out.println("Multiplication is : " + (a*b));
		
		sc.close();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error Type is: "+e.getClass());
			System.out.println("Error Message : "+e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error Type is: "+e.getClass());
			e.initCause(new Throwable("Input expected was integer"
					+ " type Number but found String type"));
			System.out.println("Error Message : "+e.getCause());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error Message is : "+ e.getMessage());
		}
		catch(Exception e) //This is generic catch Handler
		{
			System.out.println("Error Type is: "+e.getClass());
			System.out.println("Error Message : "+e.getMessage());
		}
	}

}
