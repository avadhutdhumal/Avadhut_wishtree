package contineu;
import java.util.Scanner;
public class Automorphic_Number {
	int num,sqr;
	
	void check()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number: ");
		num=sc.nextInt();
		sc.close();
	}
	
	void calculate()
	{
		sqr=num*num;
		System.out.println("Square of number is  " +sqr);
		 while (num>0)
		 {
			 int k=sqr%10;
			 
			 if(k==num)
			 {
				 System.out.println("This Is Atomorphic Number");
			 }
			 
			 else
			 {System.out.println("This IS Not Atomorphic Number");}
			 
			 break;
		 }
	}

	public static void main(String[] args) {
		Automorphic_Number a=new Automorphic_Number();
		a.check();
		a.calculate();

	}

}
