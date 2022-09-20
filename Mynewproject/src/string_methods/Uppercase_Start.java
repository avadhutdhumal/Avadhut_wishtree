package string_methods;

public class Uppercase_Start {

	public static void main(String[] args) {

		String str = "java is programming language";

		String words[] = str.split("\\s");
		String newString = "";

		for (String w : words) {
			String first = w.substring(0, 1);
			String rest = w.substring(1);

			newString += first.toUpperCase() + rest + " ";
		}

		System.out.println(newString);
	}
}
