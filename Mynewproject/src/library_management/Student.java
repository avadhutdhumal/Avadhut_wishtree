package library_management;

import java.util.Arrays;

public class Student {
		
		String studentName;
		int s_id;
		String s_dept;
		Book bk[];
		
		public String toString() 
		{
			return "Student name:" + studentName 
					+ "\nStudent Id:" + s_id
					+" "+ "Student Department:" +s_dept
					+ Arrays.toString(bk);
		}

		public Student() {
		}
		public Student(String studentName,int s_id,String s_dept, Book bk[]) 
		{
			this.studentName= studentName;
			this.s_id = s_id;
			this.s_dept = s_dept;
			this.bk = bk;
			
		}

	}


		

