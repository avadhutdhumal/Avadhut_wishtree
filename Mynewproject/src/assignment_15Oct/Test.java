package assignment_15Oct;

public class Test {
	
	String t_name;
	String test_given_date;
	public Test(String t_name, String test_given_date) 
	{
		super();
		this.t_name = t_name;
		this.test_given_date = test_given_date;
	}
	@Override
	public String toString() {
		return "Test Name: " + t_name+"    "+"   Test Date: " + test_given_date;
	}

}
