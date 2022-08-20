/* 
Write java Program for arithmetic operation for each operation write separate Method using 
parameter Passing and return type
  */

package assignment_6aug;

import java.util.Scanner;

public class Arithmetic_Operation {
	static int a, b;

	int add() {
		return a + b;
	}

	int substraction() {
		return a - b;
	}

	int multiplication() {
		return a * b;
	}

	float division() {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		a = sc.nextInt();
		System.out.println("Enter value of b: ");
		b = sc.nextInt();
		Arithmetic_Operation ar = new Arithmetic_Operation();

		System.out.println(ar.add());
		System.out.println(ar.substraction());
		System.out.println(ar.multiplication());
		System.out.println(ar.division());
		sc.close();
	}

}
