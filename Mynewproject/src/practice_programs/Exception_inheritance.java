package practice_programs;


class A{
	public String s=null;
	void show()
	{
		System.out.println(s.length());
	}
}
	class B  extends A
	{
		
		void show()
		{
			System.out.println("Overridden");
		}
	}
public class Exception_inheritance {

	public static void main(String[] args) {
		B b= new B();
		A a= new A();
		try {
		a.show();
		}
		catch (Exception e)
		{System.out.println(e.getMessage());}
		b.show();
		
	}

}
