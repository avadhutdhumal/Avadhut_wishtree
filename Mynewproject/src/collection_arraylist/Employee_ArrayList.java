package collection_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Employee_ArrayList {

	List<Employee> display()
	{
		Employee e1=new Employee(101,"Raju",10800);
		Employee e2=new Employee(102,"Sham",8782);
		Employee e3=new Employee(103,"Babu",15000);
		Employee e4=new Employee(104,"Sonu",7000);
		Employee e5=new Employee(105,"Amit",9654);
		Employee e6=new Employee(106,"Uday",15620);
		
		ArrayList<Employee> al=new ArrayList<>();

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		return al;
}
}