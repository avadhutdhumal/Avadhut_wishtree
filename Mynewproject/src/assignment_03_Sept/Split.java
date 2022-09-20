//WAP to split string into 2 tokens where string is “HELLO$WORLD”
package assignment_03_Sept;
public class Split {

	public static void main(String[] args) {

		String s = "HELLO#WORLD";
		String str[] = s.split("#");
		for (int i = 0; i < str.length; i++) 
		{
			System.out.print(str[i] + " ");
		}

	}
}
