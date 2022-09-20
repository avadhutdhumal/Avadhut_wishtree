package exceptiion;

abstract class Demo {
	void show() {

	}

	abstract void show_features();

	Demo() {
		System.out.println("I am Constructor");
	}

}

class Demo1 extends Demo {

	@Override
	void show_features() {
		// TODO Auto-generated method stub

	}
}

public class Abs_constructor {
	public static void main(String[] args) {
		Demo d = new Demo1();

	}

}
