package statickeyword;

public class Keyword {

	String name="Suraj";
	int salary=35000;
	
	void accept (String name1,int salary1)
	{
		name1=name;
		salary1=salary;
	}
	
	void show()
	{
	System.out.println(name+ " " +salary);
	}
	public static void main(String[] args) {
			
		Keyword k=new Keyword();
		k.show();
	
	}
}
