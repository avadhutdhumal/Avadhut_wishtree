import java.util.Scanner;

public class Number_divisible_or_not {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter your number: ");
		i = sc.nextInt();

		if (i % 3 == 0 && i % 8 == 0)
			System.out.println("Your number is divisible");
		else
			System.out.println("Your number is not  divisible");
		sc.close();
	}

}
