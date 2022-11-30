package written_Test1;

public class Ques17 extends Thread {

	public static void main(String args[]) {

		Thread t = new Ques17();
		System.out.println("Before starting thread");
		t.start();

		System.out.println("After starting thread");
	}
}
