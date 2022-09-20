package array;

import java.util.Scanner;

public class Array_Guess {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] guess = new int[5];
		boolean present = false;

		System.out.println("Enter Elements");
		for (int i = 0; i < guess.length; i++) {
			guess[i] = sc.nextInt();
		}

		System.out.println("Enter Number: ");
		int num = sc.nextInt();

		for (int j : guess)
			if (j == num)
				present = true;
		if (present == true) {
			System.out.println("Number is Present In array");
		} else {
			System.out.println("Number is Not Present In array");
		}
	}

}
