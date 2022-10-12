package assignment_17Sept;

public class Number_Format {

	public static void main(String[] args) {
		String  s="ABC";
		try {
		int i=Integer.parseInt(s);
		System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}
