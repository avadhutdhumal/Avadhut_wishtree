import java.util.Scanner;

public class Seconnd_highest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter first number: ");
		a = sc.nextInt();

		System.out.println("Enter second number: ");
		b = sc.nextInt();

		System.out.println("Enter third number: ");
		c = sc.nextInt();

		String ans = a > b && b < c ? a + " is Second highest"
				: b > a && a < c ? b + " is Second highest" : c + " is Second highest";
		System.out.println(ans);
		sc.close();

	}

}
