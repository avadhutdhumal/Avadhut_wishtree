package assignment_17Sept;

public class Member_Inner {

	private int age = 26;

	class Inner {
		 void display() {
			System.out.println("My age is" + age);
			
		}
	}

	public static void main(String args[]) {
		Member_Inner m = new Member_Inner();
		Member_Inner.Inner in = m.new Inner();
		in.display();
	}

}
