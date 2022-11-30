package written_Test1;

public class Ques21 {

	public static void main(String[] args) {

		String s = "TWITTER";
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);

		}
		System.out.println(r);
	}

}
/* Reverse string in Java without using StringBuffer */