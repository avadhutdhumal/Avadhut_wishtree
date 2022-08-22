/*
 * What is abstraction show the code of real time example?
 
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, 
for example, sending SMS where you type the text and send the message.
 You don't know the internal processing about the message delivery.
*/
package assignment_21_Aug;

abstract class Coffee {

	abstract void recipie();
}

class IrishCoffee extends Coffee 
{

	void recipie() {
		System.out.println("Irish Capachino Recipie");
	}
}

class Cold_Coffee extends Coffee
{
	@Override
	void recipie()
	{
		System.out.println("Cold Coffee Made from Milk And IceCream");
	}
	}

public class Abstarction1 {
	public static void main(String args[]) {
		Coffee c = new IrishCoffee();
		c.recipie();
		c = new Cold_Coffee();
		c.recipie();

	}
}
