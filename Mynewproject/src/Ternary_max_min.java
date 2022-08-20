import java.util.Scanner;

public class Ternary_max_min {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int p, q, r;
		System.out.println("Enter first number");
		p = sc.nextInt();

		System.out.println("Enter Second number");
		q = sc.nextInt();

		System.out.println("Enter Third number");
		r = sc.nextInt();

		String ans = p > q && p > r ? p + " is maxmimum" : q > p && q > p ? q + " is maximum" : r + "is maximum";
		System.out.println(ans);
		sc.close();

	}

}
