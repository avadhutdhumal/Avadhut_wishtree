package assignment_27_Aug;

import java.util.Scanner;

public class Employee {

	int eid;
	String ename;
	Department dept;

	Employee(int eid, String ename, Department dept) {
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}

	public static void main(String[] args) {

		Employee a[] = new Employee[2];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter Emp id: ");
			int eid = sc.nextInt();
			System.out.println("Enter Emp Name: ");
			String ename = sc.next();
			System.out.println("Enter Dept id: ");
			int did = sc.nextInt();
			System.out.println("Enter Dept Name: ");
			String dname = sc.next();
			a[i] = new Employee(eid, ename, new Department(did, dname));

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("Employee Id: "+a[i].eid + " " +"Employee Name: "+ a[i].ename + " " +"Department ID: "+ a[i].dept.did + " " +"Department Name: "+ a[i].dept.dname);
		}

	}

}

class Department {
	int did;
	String dname;

	Department(int did, String dname) {
		this.did = did;
		this.dname = dname;
	}

}
//Employee class with fields (empno, empname, dept) 
//where dept is object of department class with fields 
//(deptId, deptname) Write a program to create array of 3 
//employees each employee will have different department.
