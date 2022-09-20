package exceptiion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchHandlerExample {

	public static void main(String[] args) {
	
		int arr[] ;
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array  : ");
		int size = sc.nextInt();
		arr = new int[size];
		int sum=0;
		System.out.println("Enter elements of array : ");
		for(int i=0;i<=arr.length;i++)
		{
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("Sum of all elements in array is : " + sum);
		System.out.println("Average of elements in array is : " + (sum/arr.length));
		
		sc.close();
		}
		catch(ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error Type is: "+e.getClass());
			System.out.println("Error Message : "+e.getMessage());
		}
		catch(Exception e) //This is generic catch Handler
		{
			System.out.println("Error Type is: "+e.getClass());
			System.out.println("Error Message : "+e.getMessage());
		}
		
	}

}
