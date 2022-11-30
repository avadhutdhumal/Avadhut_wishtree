package written_Test1;

public class Ques13 {

	public static void main(String[] args) {
		int i = 2, j = 5;
		String str;
		int k = i++ * --j;
		
		str = k < 8 ? "false" : "True";
		System.out.println(str.equals("false") ? "White" : "Black");

	}

}
