package assignment_13aug;

class GrandPa
{
void display1()
	{	
	System.out.println("I Am GrandFather");
	System.out.println("My Name is Ramlal");
	System.out.println("My age is 70 years");
	}
}

class Father extends GrandPa
{
	void display2()
	{	
	System.out.println("I Am Father");
	System.out.println("My Name is Shamlal");
	System.out.println("My age is 50 years");
	}
}

class Son extends Father
	{	
	void display3()
	{	
	System.out.println("I Am Son");
	System.out.println("My Name is Mani");
	System.out.println("My age is 26 years");
	}
	
	}

public class Multilevel_Inheritance1 {

	public static void main(String[] args) {
		Son s= new Son();
		s.display1();
		System.out.println("***---***");
		s.display2();
		System.out.println("***---***");
		s.display3();

	}

}
