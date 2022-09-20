package loops;
import java.util.Scanner;
public class Base_Index_Power {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int base,index;
	int power=1;
		System.out.println("Enter Base: ");
		base=sc.nextInt();
	
		System.out.println("Enter Index: ");
		index=sc.nextInt();
	
		while(index!=0)
		{
			power=power*base;
			index--;
		}
			System.out.println("Power of number is: " +power);
			sc.close();
	}

}
