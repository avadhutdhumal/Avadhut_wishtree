//Write a Java program to find highest frequency character in a string
package assignment_03_Sept;

public class Max_Occrance {

	public static void main(String[] args) {
		String s = "Java is good programming language";
		char maxchar = ' ';
		int i, max = -1;
		int[] charFreq = new int[120];

		for (i = 0; i < s.length(); i++) 
		{
			charFreq[s.charAt(i)]++;
		}
		
		for (i = 0; i <s.length(); i++) 
		{
			char ch = s.charAt(i);
			
			if (max < charFreq[ch]) 
			{
				max = charFreq[ch];
				maxchar = ch;
			}
		}
		System.out.println("The Maximum Occurring Character = " + maxchar);
		System.out.println(maxchar + " Character Occurs " +max +" Times.");

	}
}
