package array;

import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		
		int i;
		int arr[]= new int[6];
		
		int size=sc.nextInt();
		System.out.println("Enter elemenst");
		for( i=0;i<size;i++)
		{
		arr[i]=sc.nextInt();	
		}
		System.out.println("Give inde to insert your value");
		int index=sc.nextInt();//3
		System.out.println("Give inserted value");
		int new_value=sc.nextInt();
		for( i=size-1;i>=index;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[index]=new_value;
		//i++;
		
		for( i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
