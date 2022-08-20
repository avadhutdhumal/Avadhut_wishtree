/*Student
{ int id; String name;
}
q3)add method displayData inside Student class change
values of id name in that method & also print the changed
values in same method. Call displayData method from
main method and see the output. Observe displayData can
only be called by creating object of Student
*/


package assignment_6aug;

public class Student1 {
	
	int id=258;
	String name="Rohan";
	
	void displayData()
	{
	id =558;
	name="Rajesh";
	System.out.println("ID is: " +id);
	System.out.println("Name is : " +name);
	int x=getId();
	this.id=x;
	System.out.println(this.id);
	}
	
	int getId()
	{
		return id;
	}
	
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.displayData();
		System.out.println(s.getId());
	
	}

}
