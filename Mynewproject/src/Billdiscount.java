import java.util.Scanner;

public class Billdiscount {

	public static void main(String[] args) {

		float quantity, price;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Quantity :");
		quantity = sc.nextFloat();

		System.out.println("Please Enter Price :");
		price = sc.nextFloat();

		float amt = quantity * price;

		if (amt >= 5000) {
			amt = amt - (amt * 5 / 100);
			System.out.println("Your Total Bill is with 5% Discount :" + amt);
		}

		else if (amt >= 10000 && amt < 5000) {
			amt = amt - (amt * 10 / 100);
			System.out.println("Your Total Bill is with 10% discount :" + amt);
		}

		else if (amt >= 2000 && amt <= 5000) {
			amt = amt - (amt * 2 / 100);
			System.out.println("Your Total Bill is with 02% discount :" + amt);
		}

		else {
			System.out.println("Sorry Your Total Bill is with no discount :" + amt);
		}
		sc.close();
	}
}
