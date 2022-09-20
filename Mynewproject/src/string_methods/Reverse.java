package string_methods;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		String s="hello";
		char c[]=s.toCharArray();
		
		/*for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		System.out.println(s);*/
		
		for(int i=0;i<c.length/2;i++)
		{
			char temp=c[i];
			c[i]=c[c.length-i-1];
			c[c.length-i-1]=temp;
		}
		s=Arrays.toString(c);
		System.out.println(s.charAt(0));
	}

}
