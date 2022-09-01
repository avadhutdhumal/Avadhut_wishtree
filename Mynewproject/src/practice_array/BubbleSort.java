package practice_array;

import java.util.Scanner;

public class BubbleSort {
	static int arr[];
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("How many Elements in array ?");
	int size = sc.nextInt();
	arr = new int[size];
	
	System.out.println("Enter Elements in array :");
	for(int i = 0;i<size;i++)
	{
		arr[i] = sc.nextInt();
	}
	for(int i = 0;i<size;i++)
	{
		for(int j=0;j<size-1-i;j++)
		{
			if(arr[j+1] < arr[j])
			{
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j] =temp;
			}
		}
	}
	System.out.println("After sorting : ");
	for(int i=0;i<size;i++)
		System.out.print(arr[i] + "   ");
	}
	
}
