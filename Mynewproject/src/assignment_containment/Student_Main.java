package assignment_containment;

import java.util.Scanner;
public class Student_Main {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Student Roll Number: ");
		int roll_number=sc.nextInt();
		
		System.out.println("Enter Student Name: ");
		String sname=sc.next();
		
		System.out.println("Enter Department ID: ");
		int id=sc.nextInt();
		
		System.out.println("Enter Department Name: ");
		String d_name=sc.next();;
		
		Student s=new Student();
		s.setroll_number(roll_number);
		s.setsname(sname);
		
		Department d=new Department();
		s.setDepartment(d);
		s.getDepartment().setId(id);
		s.getDepartment().setD_name(d_name);
		
		System.out.println("Student Roll Number: "+s.getroll_number());
		System.out.println("Student Name: "+s.getsname());
		System.out.println("Department ID: "+s.getDepartment().getId());
		System.out.println("Department Name: "+s.getDepartment().getD_name());

	}

}
