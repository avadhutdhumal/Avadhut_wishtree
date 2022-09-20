package practice_programs;


class Employee
{
	int id;
	String name;
	static String dept="QA";
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	static void change()
	{
		dept="Developer";
	}
	
	void display()
	{
		System.out.println(id+ "  "+name+ " "+dept);
	}
}
public class Static_Change {

	public static void main(String[] args) {
		Employee.change();
		Employee e= new Employee(12, "Rajj");
		Employee e1= new Employee(13,"Shiva");
		
		e.display();
		e1.display();
		
	}

}
