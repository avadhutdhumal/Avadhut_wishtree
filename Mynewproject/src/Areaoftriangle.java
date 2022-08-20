import java.util.Scanner;

public class Areaoftriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter width of Triangle:");
		double b = sc.nextDouble();

		System.out.println("Enter height of Triangle:");
		double h = sc.nextDouble();

		double area = (b * h) / 2;
		System.out.println("Area of Triangle is: " + area);
		sc.close();
	}

}
