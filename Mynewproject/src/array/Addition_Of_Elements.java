package array;
import java.util.Scanner;

public class Addition_Of_Elements {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int size = sc.nextInt();
		int[] add = new int[size];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < size; i++) {
			add[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println("Elements whose sum is: " + num);
		for (int i = 0; i < add.length; i++)
		{
			for (int j = i; j < add.length; j++)
			{
				if ((add[i] + add[j]) == num && i != j) 
				{
					System.out.println(add[i] + " + " + add[j]);
				}
			}
		}
		
	}
}
