package string_methods;

public class Methods {
	public static void main(String ar[]) {

		String s = "hello";

		/*
		 * char s1[]= {'a','b','c'}; System.out.println(s1);
		 */
		/*
		 * char ch=s.charAt(3); System.out.println(ch);
		 */
		int count = 0;

		char c[] = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (i == 3) {
				c[i] = (char) (c[i] - 32);
			}
			System.out.print(c[i]);
		}

		for (int i = 0; i < c.length; i++) {
			count++;
		}
		System.out.println(count);
		System.out.println(s.length());

	}

}
