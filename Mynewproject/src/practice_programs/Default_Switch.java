package practice_programs;
import java.util.Scanner;

public class Default_Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter grade");
		String grade=sc.next();
		switch(grade)
		{
		case "A'":
			System.out.println("Great");
			break;
		case "B":	
			System.out.println("Good");
			break;
		case "C":	
			System.out.println("Best");	
			break;
		default:
			System.out.println("INVALID");	
		}
		sc.close();
	}

}
