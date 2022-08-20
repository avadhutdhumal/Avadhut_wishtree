import java.util.Scanner;

public class Studentpercentage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int phy, chem, maths;
		System.out.println("Enter physics marks: ");
		phy = sc.nextInt();
		System.out.println("Enter chemistry marks: ");
		chem = sc.nextInt();
		System.out.println("Enter Maths marks: ");
		maths = sc.nextInt();
		int totalmarks = phy + chem + maths;
		float percentage = (totalmarks * 100 / 300);

		System.out.println("Student Total marks is : " + totalmarks);
		System.out.println("Student percentage is : " + percentage);

		if (percentage >= 80)
			System.out.println("Grade A+");
		else if (percentage >= 60 && percentage <= 80) {
			System.out.println("Grade A");
		} else if (percentage >= 60 && percentage <= 80) {
			System.out.println("Grade B");
		} else if (percentage >= 40 && percentage <= 60) {
			System.out.println("Grade Pass");
		} else {
			System.out.println("Grade Fail");
		}
		sc.close();
	}

}
