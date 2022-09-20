package assignment_03_Sept;

public class Swapping {

	public static void main(String[] args) {

		String a = "Dhumal";
		String b = "Avadhut";

		int i = a.length();
		a = a + b;
		b = a.substring(0, i);
		a = a.substring(i);

		System.out.println("'a' after swapping :" + a);
		System.out.println("'b' after swapping :" + b);
	}

}
