package hashmap;

public class ThreeLetterWord {

	public static void main(String[] args) {
		String s = "This is an Umbrella Umbrella beautiful";

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (i == 3) {
				ch[i] = ch[i + 1];
			}
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}

}
