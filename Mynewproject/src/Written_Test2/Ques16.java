package Written_Test2;

interface Eatable {
	void eat();
}

public class Ques16 {

	public static void main(String[] args) {

		Eatable e = new Eatable() {
			public void eat() {
				System.out.println("nice fruits");
			}
		};
		e.eat();
	}

}
