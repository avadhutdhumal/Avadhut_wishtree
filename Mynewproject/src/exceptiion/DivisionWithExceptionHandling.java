package exceptiion;
public class DivisionWithExceptionHandling {

	public static void main(String[] args) 
	{
		try
		{
		int a = 20;
		int b = 5;
		float c = a/b;
		System.out.println("Division is : " + c);
		System.out.println("Addition is : " + (a+b));
		System.out.println("Multiplication is : " + (a*b));
		}
		catch(ArithmeticException e)
		{
		 	System.out.println(e.getMessage());
		 	System.out.println("Please do not divide number by ZERO");
			System.out.println(e.getClass());
			
		}
		System.out.println("Exception Handling done successfuly");
	}

}
