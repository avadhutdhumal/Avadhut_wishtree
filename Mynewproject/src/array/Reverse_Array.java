package array;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int rev[] = new int[5];
		for (int i = 0; i < rev.length; i++) {
			System.out.println("Enter Elements");
			rev[i] = sc.nextInt();

		}
		//show elements
		System.out.println("Elements Are: ");
		for (int i = 0; i < rev.length; i++) {
			System.out.print(+rev[i] + " ");
		}

		System.out.println();
		//copyig array 1 to 2 
		
		int rev2[] = new int[rev.length];
		for (int i = 0; i < rev.length; i++) {
			rev2[i] = rev[i];
		}
		
		//printing reverse
		System.out.println("Reverse Elements Are: ");
		
		for(int i=rev2.length-1; i>=0; i--)
		{
			System.out.print(rev2[i]+" ");
		}
	}

}
