package assignment_03_Sept;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		boolean flag = false;
		String a = "Own";
		String b = "Now";
		
		String a1=a.toLowerCase();
		String b1=b.toLowerCase();
		
		char ah[] = a1.toCharArray();
		char bh[] = b1.toCharArray();
		
		Arrays.sort(ah);
		Arrays.sort(bh);
		
		flag = Arrays.equals(ah, bh);

		if (flag==true) 
		{
			System.out.println("String is Anagram");
		} 
		else
			System.out.println("String is Not Anagram");

	}

}
