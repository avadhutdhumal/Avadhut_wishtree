import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float radius;

		System.out.println("Enter the radius of circle:");
		radius = sc.nextFloat();
		float area = 3.14f * radius * radius;

		System.out.println("The area of circle is: " + area);
		float circumference = 2 * 3.14f * radius;

		System.out.println("The circumference of circle is: " + circumference);
		sc.close();
	}

}
