import java.util.Scanner;

public class Studentmarks {

	public static void main(String[] args) {
		
		int marks;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your marks:");
		marks = sc.nextInt();

		if (marks >= 40)
			System.out.println("Congratulations You are Pass!");
		else
			System.out.println("Sorry You are Fail");
		sc.close();
	}

}
