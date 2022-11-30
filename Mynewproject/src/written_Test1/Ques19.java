package written_Test1;

public class Ques19 {

	Ques19() {
		System.out.println("I am Default Constructor");
	}

	Ques19(int a) {
		this(15, "Chaining");
		System.out.println("I am Parameterized-1 " + a);
	}

	Ques19(int a, String b) {
		this();
		System.out.println("I am Paramaterized-2: " + a + " " + b);

	}

	public static void main(String[] args) {
		Ques19 q = new Ques19(10);

	}

}
