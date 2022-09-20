package practice_programs;


class Student 
{
	int id;
	String name;
	static String college="DKTE";
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id +" "+name+ " "+college);
	}
	
	}
public class Static_Sttudent {

	public static void main(String[] args) {
		Student s=new Student(111, "Aksash");
		Student s1=new Student(112,"Suraj");
		s.display();
		s1.display();
		
		
	}

}
