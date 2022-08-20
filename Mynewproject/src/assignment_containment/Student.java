package assignment_containment;

public class Student {
	private int roll_number;
	private String sname;
	private Department d;
	
	public void setroll_number(int roll_number)
	{
		this.roll_number=roll_number;
	}
	
	public int getroll_number()
	{
		return roll_number;
	}

	public void setsname(String sname)
	{
		this.sname=sname;
	}
	
	public String getsname()
	{
		return sname;
	}

	public Department  getDepartment () {
		return d;
	}

	public void setDepartment (Department d) {
		this.d = d;
	}
	
	
}
