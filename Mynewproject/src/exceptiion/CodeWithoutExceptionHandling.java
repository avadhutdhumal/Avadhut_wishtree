package exceptiion;
import java.util.Scanner;

public class CodeWithoutExceptionHandling {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of a : ");
		int a = sc.nextInt();

		System.out.println("Enter Value of b : ");
		int b = sc.nextInt();
		
		float c = a/b;
		System.out.println("Division is : " + c);
		System.out.println("Addition is : " + (a+b));
		System.out.println("Multiplication is : " + (a*b));
		
	}

}
