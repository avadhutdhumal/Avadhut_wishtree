package assignment_21_Aug;

class Demo {
	final int x = 25;

	final void display() {

	}
}

class DemoChild extends Demo {

		//final method cannot be overridden
	//void display()
	{
		
	}
	
}

//final class cannot extended
class Child1 extends DemoChild {
	
}

public class Demo_Main {

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.x);
		// d.x=40;
		// final variable cannot be modified

	}

}
