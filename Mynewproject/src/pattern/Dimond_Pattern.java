/* 	*
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 
    */

package pattern;
public class Dimond_Pattern {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=5;i++)
		{
			for(int sp=4;sp>=i;sp--) // space is added here
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}	
			for(i=4;i>=1;i--)
			{
				for(int sp=4;sp>=i;sp--) // space is added here
				{
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}

	}
	}
