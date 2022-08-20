package assignment_6aug;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		int studentId=sc.nextInt();
		
		System.out.println("Enter Student Name: ");
		String studentName=sc.next();
		
		System.out.println("Enter Student Address: ");
		String studentAddress=sc.next();
		
		
		while(true)
		{
			System.out.println("Is Student Is From NIT? Yes/No");
			String ans=sc.next();
			
			if(ans.equalsIgnoreCase("yes"))
	         {
	             Student s = new Student(studentId, studentName, studentAddress);
	             
	            System.out.println("Student ID: "+s.getstudentId());
	            System.out.println("Student Name: "+s.getstudentName());
	            System.out.println("Student Address: "+s.getstudentAddress());
	            System.out.println("College Name: "+s.getcollegeName());	      
	             break;
	         } 
			
	             else if(ans.equalsIgnoreCase("no"))
	            	 
	             { 
	            	 System.out.println("Enter College Name: ");
	             	String collegename =sc.next();
	             	
	             	Student s1=new Student(studentId, studentName, studentAddress,collegename);
	             	
	            	System.out.println("Student ID: "+s1.getstudentId());
		            System.out.println("Student Name: "+s1.getstudentName());
		            System.out.println("Student Address: "+s1.getstudentAddress());
		            System.out.println("College Name: "+s1.getcollegeName());	 
	             }	 
	             
	             else {
	            	 System.out.println("Invalid Answer");
	            	 }
		}
	}

}