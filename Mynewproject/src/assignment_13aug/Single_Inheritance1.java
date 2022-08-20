package assignment_13aug;

class Company {
    void salary() 
    {
        System.out.println("Company Name: Accenture");
    }
}

class Employee extends Company
{ 
    void bonus() 
    {
        System.out.println("Employee Name: Suraj");
    }
}

public class Single_Inheritance1 {

	public static void main(String[] args) {
		Employee e = new Employee();
        e.salary(); 
        e.bonus();
	}
}
