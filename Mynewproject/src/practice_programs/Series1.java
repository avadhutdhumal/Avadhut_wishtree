package practice_programs;
import java.util.Scanner;

public class Series1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range");
		int n=sc.nextInt();
		int pr=1;
		for (int i=1; i<=n; i++)
		{
			pr=pr*2+1;
			
			System.out.print(pr+" ");
		}
		
	}

}
