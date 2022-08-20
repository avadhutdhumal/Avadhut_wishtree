package array;

public class First_Array {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60};
		System.out.println(arr.length); 
		
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		for (int i=arr.length-1; i>=0; i--)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		//sum
		int sum=0;
		for (int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array: "+sum);
		
		//avg
		for (int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		System.out.println("Avg of Array: "+avg);
	}
}
