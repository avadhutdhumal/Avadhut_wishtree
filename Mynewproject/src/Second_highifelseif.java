import java.util.Scanner;

class Max_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		System.out.println("Enter third number");
		c = sc.nextInt();

		if (a > b && b < c) {
			System.out.println("A is 2nd max");
		}

		else if (b > a && a < c) {
			System.out.println("B is 2nd max");
		}

		else
			System.out.println("C is 2nd max");
		sc.close();

	}
}