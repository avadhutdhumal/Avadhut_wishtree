package assignment_6aug;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	
	public Student(int studentId,String studentName,String studentAddress)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
		this.collegeName="NIT";
	}
	
	public Student(int studentId,String studentName,String studentAddress, String collegeName)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
		this.collegeName=collegeName;
	}
	
	public int getstudentId()
	{
		return this.studentId;
	}
	
	public String getstudentName()
	{
		return this.studentName;
	}
	
	public String getstudentAddress()
	{
		return this.studentAddress;
	}
	
	public String getcollegeName()
	{
		return this.collegeName;
	}
	
	
}
