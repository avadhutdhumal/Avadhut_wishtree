package written_Test1;

public class Ques23 {

	public static void main(String[] args) {
		Test t = new Test();
		Test.MyTest m = t.new MyTest();
		m.methodInMyTest("Hibernate");
	}
}

class Test {
	public String myStr = "Spring";

	class MyTest {
		public String myStr = "Angular";

		void methodInMyTest(String myStr) {
			Test t = new Test();
			System.out.println("myStr = " + myStr);
			System.out.println("Test.this.myStr = " + t.myStr);
			System.out.println("this.myStr = " + this.myStr);
		}
	}

}
