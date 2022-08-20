import java.util.Scanner;

public class Simpleintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p, r, t;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principal amount:");
		p = sc.nextFloat();

		System.out.println("Enter the rate of intrest:");
		r = sc.nextFloat();

		System.out.println("Enter the time period:");
		t = sc.nextFloat();

		float si = (p * r * t) / 100;
		System.out.println("The simple intrest is :" + si);
		sc.close();
	}

}
