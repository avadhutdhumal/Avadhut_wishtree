package array;

import java.util.Scanner;

public class Array2 {
public static void main(String[] a)
{
	//datatype arrayname[]=new Datatype
	// arrays are considered objects in java
	float arr[]=new float[7];
	System.out.println("Enter array elements");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	float sum=0.0f;
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextFloat();
		sum=sum+arr[i];
	}
	System.out.println(sum/7.0f);
	
	
	
	/*for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}*/
	
}
}
