
/*  
    *
   ***
  *****
 *******
*********

*/

package pattern;
public class Star_Pyramid1 {

	public static void main(String[] args) {
			for(int i=1;i<=5;i++)
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
