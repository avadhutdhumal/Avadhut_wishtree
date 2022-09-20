package string_methods;

import java.util.Scanner;

public class SecondOccurance {

	public static void main(String[] args) {
		
	String s="javapap";
	
	
	char arr[]=s.toCharArray();
	int count=0;
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter character");
	char ch=sc.next().charAt(0);
	for( i=0;i<arr.length;i++)
	{
		if(arr[i]==ch)
		{
			count++;
			
			if(count==2)
				continue;
			
		}
		System.out.print(+arr[i]);
	}
	
	/*for(int j=i-1;j<arr.length;j++)
	{
		System.out.print(arr[j]);
	}*/
	System.out.println();
	System.out.println(s.indexOf('a'));
	System.out.println(s.indexOf('a', 2));
	
	

}
}
