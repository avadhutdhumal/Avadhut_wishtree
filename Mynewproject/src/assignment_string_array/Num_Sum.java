package assignment_string_array;

public class Num_Sum {

	public static void main(String[] args) {

		String s = "ram2esh2g3";

		char[] arr = s.toCharArray();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (Character.isDigit(s.charAt(i)))
			{
				int a = Character.getNumericValue(s.charAt(i));
				sum = sum + a;
			}

			
		}
		System.out.println(sum);
	}

}
