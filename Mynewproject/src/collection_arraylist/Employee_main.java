package collection_arraylist;

import java.util.Iterator;
import java.util.List;

public class Employee_main {

	public static void main(String[] args) {
		Employee_ArrayList e=new Employee_ArrayList();

		List<Employee> li=	e.display();
		Iterator<Employee> it=	li.iterator();
		System.out.println("***ALL EMPLOYEE DETAILS***");
		System.out.println();
		
		while(it.hasNext())
		{
			Employee ee=it.next();
			
			System.out.println(+ee.e_Id+"  "+ee.e_Name+"     "+ee.e_salary);
		
		}
		
		System.out.println("\n***|EMPLOYEE WITH SALARY >10000 |***");
		
		Employee_ArrayList ex=new Employee_ArrayList();

		List<Employee> li7=	ex.display();
		Iterator<Employee> it1=	li7.iterator();
		System.out.println();
		
		while(it1.hasNext())
		{
			Employee ee=it1.next();
			if(ee.e_salary>10000) {
			
			System.out.println(+ee.e_Id+"  "+ee.e_Name+"     "+ee.e_salary);
			}
		}
		
		Employee_ArrayList eK=new Employee_ArrayList();

		List<Employee> li8=	eK.display();
		Iterator<Employee> it2=	li8.iterator();
		System.out.println("\n***|EMPLOYEE DETAIL OF RAJU|***");
		System.out.println();
		
		while(it2.hasNext())
		{
			Employee ee=it2.next();
			if(ee.e_Name.equalsIgnoreCase("RAJU")) {
			
			System.out.println(+ee.e_Id+"  "+ee.e_Name+"     "+ee.e_salary);
			}
		}
		
		List<Employee> li9=	eK.display();
		Iterator<Employee> it3=	li9.iterator();
		System.out.println("\n***|MAXIMUM SALARY|***");
		System.out.println();
		
		while(it3.hasNext())
		{
			Employee eee=it3.next();
			int max=0;
			
			if(eee.e_salary>max)
		{
			max=eee.e_salary;
			System.out.println(max);
		}
			
		}
		
		
		
		
		
		
	}

}
