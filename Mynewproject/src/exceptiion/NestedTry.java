package exceptiion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
		try
		{
			String s="123.56";
			int a1=Integer.parseInt(s);
			System.out.println(a1);
		
			try
			{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println(a);
		}
			catch(InputMismatchException n)
			{
				System.out.println("plz pass number");
				
			}
			
		}catch(Exception e) 
		{System.out.println(e);}
		

	}
}


