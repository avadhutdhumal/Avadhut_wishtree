import java.util.Scanner;

public class Itemprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float quantity, price;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Quantity :");
		quantity = sc.nextFloat();

		System.out.println("Please Enter Price :");
		price = sc.nextFloat();

		float amt = quantity * price;
		System.out.println("Your Total Bill is :" + amt);
		sc.close();

	}

}
