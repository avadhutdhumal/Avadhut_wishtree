package exceptiion;

public class Try1 {

	public static void main(String[] args) {
		
		int a=5;
		try
		{
		System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest");
	}

}
