import java.util.Scanner;

public class Rectanglearea {

	public static void main(String[] args) {

		int l, b, perimeter, area;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of rectangle: ");
		l = sc.nextInt();

		System.out.println("Enter the breadth of rectangle: ");
		b = sc.nextInt();

		perimeter = 2 * (l + b);
		System.out.println("Perimeter of rectangle is : " + perimeter);
		area = l * b;

		System.out.println("Area of rectangle is : " + area);
		sc.close();

	}

}
