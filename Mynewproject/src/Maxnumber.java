import java.util.Scanner;

public class Maxnumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;
		System.out.println("Enter first number:");
		a = sc.nextInt();

		System.out.println("Enter second number:");
		b = sc.nextInt();

		System.out.println("Enter third number:");
		c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("A is greater");
		}

		else if (b > a && b > c) {
			System.out.println("B is greater");
		}

		else {
			System.out.println("C is greater");
		}
		sc.close();

	}

}
