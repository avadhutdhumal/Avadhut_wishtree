package assignment_27_Aug;

import java.util.Scanner;

public class Student {
	
	int id;
	String name;
	//Boolean isspecial;
	Course c;
	
	Student (int id,String name,Course c)
	{
		this.id=id;
		this.name=name;
		this.c=c;
	}

	public static void main(String[] args)
    {
		Student a[]=new Student[2];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter Name:");
			String name=sc.next();
			System.out.println("Enter Course name:");
			String cname=sc.next();
			System.out.println("Enter Course fees:");
			int fees=sc.nextInt();
			
			a[i]=new Student(id,name,new Course(cname,fees));
		
		
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].id+" "+a[i].name+" "+a[i].c.cname+" "+a[i].c.fees);
		}

	}

}
class Course
{
	String cname;
	int fees;
	
	Course(String cname, int fees)
	{
		this.cname=cname;
		this.fees=fees;
	}
	
}
//There is Student class { int id , string name ,Boolean isspecial , Course c } . 
//Course {String cname , int fees } Assume that there is array of 10 student objects.
//Write a program to set isspecial to be true if course fee
//of that student is more than 50000.
