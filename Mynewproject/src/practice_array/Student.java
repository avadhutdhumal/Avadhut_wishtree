package practice_array;

import java.util.Scanner;

// 3)There is Student class { int id , string name ,Boolean isspecial , Course c } .
//   Course {String cname , int fees } Assume that there is array of 5 student
//   objects. Write a program to set isspecial to be true if course fee of that
//   student is more than 50000.

public class Student 
{
	int id;
	String name;
	static boolean isspecial=false;
	Course c;
	
	public Student(int id,String name,Course c)
	{
		this.id=id;
		this.name=name;
		this.c=c;
	}
	
	public String toString()
	{
		return "Student id is "+id+"\n Student Name is "+name+" "+isspecial+ "course "+c;
	}
	
	public boolean check(int fees)
	{
		if(fees>50000)
		{
			
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) 
	{
		Course[] c=new Course[3];
		Student s[]=new Student[3];
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("enter Student Name");
			String name=sc.next();
			System.out.println("Enter Student id");
			int id=sc.nextInt();
			System.out.println("Enter Course name ");
			String cname=sc.next();
			System.out.println("Enter Course fees");
			int fees=sc.nextInt();
			
			c[i]=new Course(cname, fees);
			s[i]=new Student(id,name,c[i]);
			boolean check= s[i].check(fees);
			if(check==true)
			{
				isspecial=true;
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(s[i]);
			System.out.println(c[i]);
		
			
		}
		

	}

}
