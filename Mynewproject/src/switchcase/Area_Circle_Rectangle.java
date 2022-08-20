package switchcase;
import java.util.Scanner;
public class Area_Circle_Rectangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Menu: ");
		System.out.println("1.Area Of Circle");
		System.out.println("2.Area Of Square");
		System.out.println("3.Area Of Triangle");
		System.out.println("4.Circumference Of Circle");
		System.out.println("5.Perimeter of Square");
		
		System.out.println("Please choose your option: ");
		int num= sc.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("Enter radius of circle: ");
			double radius=sc.nextDouble();
			double areac= 3.14*radius*radius;
			System.out.println("Area of circle is : "+areac);
			break;
			
		case 2:
			System.out.println("Enter lenth of square: ");
			double length=sc.nextDouble();
			double areas=length*length;
			System.out.println("Area of Square is : "+areas);
			break;
			
		case 3:
			System.out.println("Enter the height of triangle: ");
			double height=sc.nextDouble();
			System.out.println("Enter the base of triangle: ");
			double base=sc.nextDouble();
			double areat=base*height;
			System.out.println("Area of Triangle is : "+areat);
			break;
			
		case 4:
			System.out.println("Enter radius of circle: ");
			double radius1=sc.nextDouble();
			double circumference= 2*3.14*radius1;
			System.out.println("Circumference of circle is : "+circumference);
			break;
			
		case 5:	
			System.out.println("Enter lenth of square: ");
			double length1=sc.nextDouble();
			double perimeter=4*length1;
			System.out.println("Perimeter of Square is : "+perimeter);
			break;
		}
		sc.close();		
	}

}
