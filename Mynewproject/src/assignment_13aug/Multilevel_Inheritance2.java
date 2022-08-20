package assignment_13aug;


class FruitBig
{
	void display()
	{
		System.out.println("A Fruit is full of Nutricians.");
	}
}

class Coconut extends FruitBig
	{
	void display1()
	{
		System.out.println("Coconut water is very nutricious.");
	}
	}

class Oil extends Coconut
	{
	void display2()
	{
		System.out.println("Coconut oil is also good for hairs");
	}
	}

public class Multilevel_Inheritance2 {

	public static void main(String[] args) {
		Oil o=new Oil();
		o.display();
		o.display1();
		o.display2();

	}

}
