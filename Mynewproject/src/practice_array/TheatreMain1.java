package practice_array;

import java.util.Scanner;

public class TheatreMain1 {

	public static void main(String[] args) {
		
		Movie1 m[]=new Movie1[2];
		m[0]=new Movie1(1,"bahubali",5.6f);
		m[1]=new Movie1(2,"RRR",7.6f);
		Theatre1 t[]=new Theatre1[2];
		System.out.println(m.length);
		System.out.println(t.length);
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter theatre id");
			int id=sc.nextInt();
			System.out.println("Enter theatre name");
			String name=sc.next();
			System.out.println("Enter location");
			String loc=sc.next();
			
			
			t[i]=new Theatre1(id,name,loc,m);
		}
		
		for(int i=0;i<2;i++)
		{
			System.out.println(t[i]);
			
			
		}
		
		}
		

	}


