package assignment_13aug;

class Company1 {
	String cname;
	int e_num;
	void show()
	{
		System.out.println("Comapny Name is: "+cname);
		System.out.println("Total Employees Are: "+e_num);
	}
}

class Employee1 extends Company1{
	void show1()
	{
		System.out.println("Employee-1 Name is Suraj");
		System.out.println("He is Manager");
		System.out.println("He has 7 years of Experience");
	}
}

class Employee2 extends Company1{
	void show2()
	{
		System.out.println("Employee-2 Name is Akash");
		System.out.println("He is VP");
		System.out.println("He has 15 years of Experience");
	}
}

public class Hierarchical_Inheritance3 {

	public static void main(String[] args) {
		
		Employee1 e= new Employee1();
		e.cname="TATA Technologies";
		e.e_num=500;
		e.show();
		System.out.println();
		e.show1();
		System.out.println();
		Employee2 e1= new Employee2();
		e1.show2();

	}

}
