/*WAP to find and count total number of duplicate elements in an array.*/
package array;

public class Duplicate_Num {

	public static void main(String[] args) {

		int dup []  = {25,36,94,91,24,23,24,98,41,94};
		
		for (int i=0; i<dup.length; i++)
	{
		for (int j=i+1; j< dup.length; j++) 
		{
			if (dup[i]==dup[j])
			{
				System.out.println("Duplicate Element: "+dup[j]);
			}
		}
	}


	}
}
