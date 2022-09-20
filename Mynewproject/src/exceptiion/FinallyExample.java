package exceptiion;
public class FinallyExample 
{
	public static void main(String[] args) 
	{
		try
		{
		int a = 20;
		int b = 0;
		float c = a/b;
		System.out.println("Division is : " + c);
		System.out.println("Addition is : " + (a+b));
		System.out.println("Multiplication is : " + (a*b));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		finally
		{
			System.out.println("Division operation End");
		}

	}


}
