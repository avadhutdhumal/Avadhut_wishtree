package exceptiion;

public class Myexception extends Exception
{
	public void show(int age) throws Myexception
	{
		if(age>15)
			throw new Myexception ();
		
		
				}
	void test1() throws Myexception {
	show(18);
	}

	void test2() throws Myexception
	{
		test1();
	}
	public static void main(String[] args) {
		Myexception m=new Myexception();
		try {
			m.test1();
		} catch (Myexception e) 
		{
			System.out.println(e.getStackTrace());
		}
	}

}
