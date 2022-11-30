package array_2d;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Rows");
		int rows=sc.nextInt();
		System.out.println("Enter col");
		int col=sc.nextInt();
		
		
		int arr [][]= new int [rows][col];
		System.out.print("Enter Element: ");
		for(int i=0; i<rows;  i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(arr);
		
		for(int i=0; i<rows;  i++)
		{
			System.out.println();
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			
		}
		
		
	}

}
