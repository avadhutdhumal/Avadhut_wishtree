package practice_array;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Length of arry :" + a.length);

		System.out.println("Enter Enter Array Elements :");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Array Elements are ...");
		// Accessing Array
		/*
		 * for(int i=0;i<=a.length-1;i++) { System.out.print(a[i] + " "); }
		 */
		for (int x : a) {
			System.out.print(x + " ");
		}

	}

}
