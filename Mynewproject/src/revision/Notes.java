package revision;
import java.util.Scanner;
public class Notes {

	public static void main(String[] args) {
		int amt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount: ");
		amt=sc.nextInt();
		
		int a =amt/2000;
		System.out.println("2000 Notes :"+a);
		
		int c=amt%2000/500;
		System.out.println("500 Notes :"+c);
		
		int d=amt%2000%500/200;
		System.out.println("200 Notes :"+d);
		
		int e=amt%2000%500%200/100;
		System.out.println("100 Notes :"+e);
		
		int f=amt%2000%500%200%100/50;
		System.out.println("50 Notes :"+f);
		sc.close();
	}

}
