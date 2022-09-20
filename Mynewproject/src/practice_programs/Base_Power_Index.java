package practice_programs;
import java.util.Scanner;

public class Base_Power_Index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base");
		int base=sc.nextInt();
		System.out.println("Enter Index");
		int index=sc.nextInt();
		int power=1;
		while(index>0)
		{
			power = power*base;
			index--;
		}
		
		System.out.println("Power is: "+power);
		sc.close();
	}

}
