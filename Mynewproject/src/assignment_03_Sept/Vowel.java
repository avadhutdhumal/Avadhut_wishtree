package assignment_03_Sept;

import java.util.Scanner;

public class Vowel {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int i, length = 0;
		String new_s = "";
		char ch = ' ';

		@SuppressWarnings("unused")
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Sentence:");
		String sentence="India Is My Country"; 
//		String sentence = sc.nextLine();
		length = sentence.length();

		length = sentence.length();
		sentence = sentence.toUpperCase();

		for (i = 0; i < length; i++) 
		{
			ch = sentence.charAt(i);

			if (ch == 'A') {
				new_s = new_s + 'E';
			} else if (ch == 'E') {
				new_s = new_s + 'I';
			} else if (ch == 'I') {
				new_s = new_s + 'O';
			} else if (ch == 'O') {
				new_s = new_s + 'U';
			} else if (ch == 'U') {
				new_s = new_s + 'A';
			} else {
				new_s = new_s + ch;
			}
		}

		System.out.println("Original: " + sentence);
		System.out.println("New : " + new_s);

	}

}
