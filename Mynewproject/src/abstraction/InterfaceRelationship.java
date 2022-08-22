package abstraction;

interface engine
{
	int speed=100;
	void start();
}

interface move extends engine
{
	
	int speed =100;
	void move1();
	
}

class Car12 implements move
{
  
	@Override
	public void start() {
		System.out.println("Engine started");
		
	}

	@Override
	public void move1() {
	
		System.out.println("car is moving with speed "+speed);
		
	}
	
}

public class InterfaceRelationship {

	public static void main(String[] args) {
		Car12 c=new Car12();
		c.start();
		c.move1();
		

	}

}
