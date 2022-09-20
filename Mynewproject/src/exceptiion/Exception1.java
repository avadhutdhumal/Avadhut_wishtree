package exceptiion;

public class Exception1 {

	public static void main(String[] args) {
		int a = 10;
		try {
			System.out.println(a / 2);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("user cannot divide by zero");
		}
		System.out.println("rest of the code");

	}

}
