import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number: ");
		int a;
		a = sc.nextInt();

		if (a % 2 == 0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
		sc.close();
	}

}
