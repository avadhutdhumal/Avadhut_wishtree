package assignment_17Sept;

class Outer {
	public int a = 25;
	private int b = 30;
	static int c = 85;
	static final int d = 36;

	class Inner {

		void display() {
			System.out.println("Non Static Inner class");
			System.out.println("Value of a is " + a);
			System.out.println("Value of b is " + b);
			System.out.println("Value of c is " + c);
			System.out.println("Value of d is " + d);
		}
	}

	static class Inner1 {
		static void display1() {
			System.out.println("\n" + "Static inner class");
//				System.out.println("Value of a is "+a);cannot access non-static vaariables
//				System.out.println("Value of b is "+b);cannot access non-static vaariables
			System.out.println("Value of c is " + c);
			System.out.println("Value of d is " + d);
		}

	}
}

public class Nested_Class {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner o1 = o.new Inner();
		o1.display();
		Outer.Inner1.display1();

	}

}
