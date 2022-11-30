package Written_Test2;

import java.io.IOException;

class Parent {
	void msg() throws IOException {
		System.out.println("parent");
	}
}

class TestExceptionChild3 extends Parent {
	void msg() throws NullPointerException {

		System.out.println("child");
	}

}

public class Ques2 {

	public static void main(String[] args) {

		Parent p = new TestExceptionChild3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
