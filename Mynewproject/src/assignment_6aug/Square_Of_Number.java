/* write a java program to calculate square for given number using no return type ,with return type,
with parameter passing, with parameter and return type.  */

package assignment_6aug;

import java.util.Scanner;

public class Square_Of_Number {
int a;
	void square()                           //no return type
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int sqr=num*num;
		System.out.println(+sqr);
		sc.close();
	}
	
	int square1()                         //with return type int
	{
		int a=25;
		return a*a;
	}
	
	void square1(int a)                      // with parameter passing
	{
		int square=a*a;
		System.out.println(+square);
	}

	int square2(int a)                    //with parameter and return type.
	{
		this.a=a;
		return a*a;
	}

	public static void main(String[] args) {
		
		Square_Of_Number sq=new Square_Of_Number();
		sq.square();
		System.out.println(sq.square1());
		sq.square1(25);
		System.out.println(sq.square2(25));
		

	}

}
