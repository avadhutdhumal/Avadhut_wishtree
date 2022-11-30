package written_Test1;

class Parent {
	int a = 500;
}

class child extends Parent {

	child() {
		System.out.println(a);
	}
}

public class Ques22 {

	public static void main(String[] args) {
		child c = new child();
	}

}
