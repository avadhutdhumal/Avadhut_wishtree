package abstraction;

interface Area{}
abstract class Car{
	abstract void move();
	
	Car()
	{
		System.out.println("Car is Running ");
	}
}

class Maruti extends Car implements Area
{
	int a;
	void move()
	{
		System.out.println("Moving MAruti"); 
	}
	Maruti(int a)
	{
	this.a=a;
	System.out.println(a+a);
	}
}


public class Abs_Main {

	public static void main(String[] args) {
	@SuppressWarnings("unused")
	Car c=new Maruti(1);
	}

}
