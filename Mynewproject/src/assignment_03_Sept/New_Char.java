package assignment_03_Sept;

public class New_Char {

	public static void main(String[] args) {

		String s = "India Is Beautiful Country.";
		String s1 = "Beautiful";
		String s2= "Most Beautiful";

		String new_s = s.replaceFirst(s1, s2);

		System.out.println(new_s);
	}

}
