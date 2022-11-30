package written_Test1;

import java.util.Scanner;

/*10. WAP to print following series [2M]

592
-322
590
-320
588
-318
*/
public class Ques10 {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);
	// Range should be half of desired
		System.out.println("Enter Range");
	
		num = sc.nextInt();
		int s = 592;
		int s2 = 914;
		System.out.print(s+" ");
		for (int i = 0; i < num; i++) {
			{
				s = (s - s2);
				s2 = s2 - 2;
				System.out.print(s + " ");
				s = (s + s2);
				s2 = s2 - 2;
				System.out.print(s + " ");
			}

		}

	}

}
