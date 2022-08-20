import java.util.Scanner;

public class Noteswithdrawl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount to withdraw :");
		int b = sc.nextInt();

		int a = b / 2000;
		System.out.println("2000 Notes :" + a);

		int c = b % 2000 / 500;
		System.out.println("500 Notes :" + c);

		int d = b % 2000 % 500 / 200;
		System.out.println("200 Notes :" + d);

		int e = b % 2000 % 500 % 200 / 100;
		System.out.println("100 Notes :" + e);

		int f = b % 2000 % 500 % 200 % 100 / 50;
		System.out.println("50 Notes :" + f);
		sc.close();
	}

}
