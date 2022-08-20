/* 3 5 9 17 33 65 */

package revision;
import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		int num,s=2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Range: ");
	num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			s=(s*2)-1;
			System.out.print(s+" ");
		}
	sc.close();
	}
}
