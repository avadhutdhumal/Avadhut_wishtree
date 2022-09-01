package practice_array;
import java.util.Scanner;

public class MinimumOfArray {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.print("Enter array Eements");
		for ( int i= 0 ; i<a.length ;i ++)
		{
			a[i] = sc.nextInt();
		}	

		int min = a[0];
		for ( int i= 1 ; i<a.length ;i ++)
		{
			if(a[i]<min)
				min=a[i];
		}	
		System.out.println("Minimum value from array is" + min);


	}

}
