import java.util.Scanner;

public class Daysdisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tdays;

		System.out.println("Enter the total number of days: ");
		tdays = sc.nextInt();

		int year = tdays / 365;
		System.out.println("Year: " + year);

		int month = (tdays % 365) / 30;
		System.out.println("Month: " + month);

		int days = (tdays % 365) % 30;
		System.out.println("days: " + days);
		sc.close();
	}

}
