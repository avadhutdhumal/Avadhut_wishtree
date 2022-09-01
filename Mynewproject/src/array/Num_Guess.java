package array;

import java.util.Scanner;

public class Num_Guess {

	public static void main(String[] args) {
		
		int guess[]= {25,26,47,96,36,74};
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		boolean present = false;
		
		for (int j : guess)
			if (j == num)
				present = true;
		if (present == true) 
		{
			System.out.println("Number is Present In array");
		} 
		else
		{
			System.out.println("Number is Not Present In array");
		}
	}

}
