package revision;

import java.util.Scanner;
public class Series {

	void series1 ()	
	{
		int num,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range: ");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			s=s*2+1;
			System.out.print(s+" ");
		}
		sc.close();
	}
		void series2 ()	
	
	{
		int num1,s=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range: ");
		num1=sc.nextInt();
			
			for(int i=1;i<=num1;i++)
			{
				s=(s*2)-1;
				System.out.print(s+" ");
			}
			sc.close();
		}
	
	public static void main(String[] args) {
		Series s=  new Series();
		s.series1();
		s.series2();
		
	}

}
