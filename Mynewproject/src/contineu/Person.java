package contineu;

public class Person {
	
	int person_id=1234;
	String name= "Raju";
	int weight=73;
	int age=25;
	
	void check()
	{
		System.out.println("Person name: "+name);	
		System.out.println("Person ID: "+person_id);	
		System.out.println("Person age: "+age);	
		System.out.println("Person weight: "+weight);
		
		if(age>=18 && weight>=50)
		{
			System.out.println("You Are Eligible For Blood  Donation");	
		}
		else
		{
			System.out.println("You Are Not Eligible For Blood  Donation");	
		}
		
	}
	

	public static void main(String[] args) {
	Person p =new Person();
	p.check();

	}

}
