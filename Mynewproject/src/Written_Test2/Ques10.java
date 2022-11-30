package Written_Test2;

public class Ques10 implements InterfaceDemo {

	public static void main(String[] args) {
		Ques10 impl = new Ques10();

//		impl.day = "Sunday"; error here thats why commneted
		System.out.println(impl.day);
	}
}

interface InterfaceDemo {
	String day = "Monday";
}

/*10. What will be output of following code. */