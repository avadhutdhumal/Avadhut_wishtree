package statickeyword;

public class Keyword_Program {

	String name; 
	int rollno;
	float percentage;
	
	public Keyword_Program(String name,int rollno,float percentage)
	{
		this.name=name;
		this.rollno=rollno;
		this.percentage=percentage;
	}
	
	void dipslay()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollno);
		System.out.println("Percentage: "+percentage);
	}
	
	public static void main(String[] args) {
	
		Keyword_Program k=new Keyword_Program("Rohan", 25,85.55f); 
		k.dipslay();
	}

}
