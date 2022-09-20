
package assignment_string_array;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s = "PEEK";
		String s1 = "keep";

		char c[] = s.toCharArray();
		char[] c1 = s1.toCharArray();

		for (int i = 0; i < c.length; i++) {
			c[i] = (char) ((char) c[i] + 32);
		}

		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < c1.length; i++) {
			for (int j = i + 1; j < c1.length; j++) {
				if (c1[i] > c1[j]) {
					char temp = c1[i];
					c1[i] = c1[j];
					c1[j] = temp;
				}
			}
		}

		for (int i = 0; i < c1.length; i++) {
			System.out.print(c1[i] + " ");
		}

		s = Arrays.toString(c);
		s1 = Arrays.toString(c1);

		if (s.length() == s1.length() && s.equals(s1)) {
			System.out.println("\n" + "Anagram");
		}

		else {
			System.out.println("Not Anagram");
		}

	}

}
