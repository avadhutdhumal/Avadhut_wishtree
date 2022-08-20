import java.util.Scanner;

public class Bill_disc_by_ternary {
	public static void main(String[] args) {

		float quantity, price;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Quantity :");
		quantity = sc.nextFloat();

		System.out.println("Please Enter Price :");
		price = sc.nextFloat();

		double amt = quantity * price;
		double disc = amt >= 10000 ? amt * 10 / 100 : amt * 5 / 100;

		System.out.println(disc);
		double bill = amt - disc;

		System.out.println("Your bill is with disc: " + bill);
		sc.close();

	}
}
