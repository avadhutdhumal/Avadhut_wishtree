package Written_Test2;

public class Ques4 {

	public static void main(String[] args) {
		String s = "Help Others";
		char[] in = s.toCharArray();

		char[] res = new char[in.length];

		for (int i = 0; i < in.length; i++) {
			if (in[i] == ' ') {
				res[i] = ' ';
			}
		}

		int j = res.length - 1;

		for (int i = 0; i < in.length; i++) {
			if (in[i] != ' ') 
			{
				if (res[j] == ' ')
				{
					j--;
				}
				res[j] = in[i];
				j--;
			}
		}
System.out.println(res);
	}
}

/* 4.Reverse a string preserving space positions 
 * [2M] Input : "Help others" 
 * 
 * Input : "abc de"
Output : edc ba

Input : "intern at geeks"
Output : skeegt an retni
*/
 