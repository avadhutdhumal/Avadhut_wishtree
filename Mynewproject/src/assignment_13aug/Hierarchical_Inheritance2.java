package assignment_13aug;

class College{
	String cname;
	int num_teacher;
	int num_student;
	void show()
	{
		System.out.println("Our College Name is: "+cname);
		System.out.println("Our College is Autonoums");
		System.out.println("Our College is NAAC A+ Graded");
	}
}

class Teacher extends College{
	void show1()
	{
		System.out.println("Total Teachers In College Are: "+num_teacher);
		System.out.println("All teachers Have Minimun Masters Degree");
	}
}

class Student extends College
{
	void show2()
	{
		System.out.println("Total Students In College Are: "+num_student);
		System.out.println("All teachers Have Minimun 70% Aggregate.");
	}
	
	}
public class Hierarchical_Inheritance2 {

	public static void main(String[] args) {
		Student s=new Student();
		s.cname="DKTE";
		s.show();
		System.out.println();
		s.num_student=500;
		s.show2();
		System.out.println();
		Teacher t= new Teacher();
		t.num_teacher=50;
		t.show1();

	}

}
