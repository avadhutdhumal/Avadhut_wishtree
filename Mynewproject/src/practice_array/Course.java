package practice_array;

public class Course 
{
	String cname;
	int fees;
	
	public Course(String name,int fees)
	{
		this.cname=name;
		this.fees=fees;
	}
	
	public String tostring()
	{
		return "Course Name is "+cname+"\n Course fees "+fees;
				}
}
