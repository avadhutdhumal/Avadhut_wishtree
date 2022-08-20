package abstraction;

class A
{
	final int a=10;
	
	void display()
	{
		//a=20;
		System.out.println(a);
	}
}

public class FinalVaraible {

	public static void main(String[] args) {
		A a=new A();
		a.display();

	}

}
