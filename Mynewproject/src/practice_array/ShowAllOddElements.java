package practice_array;
import java.util.Scanner;

public class ShowAllOddElements
{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.print("Enter array Eements");
		for ( int i= 0 ; i<a.length ;i ++)
		{
			a[i] = sc.nextInt();
		}	

		System.out.println("Odd Elements in array are");
		for ( int i= 0 ; i<a.length ;i ++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i] + " ");
		}	
		


	}

}
