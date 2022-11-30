package Written_Test2;

	abstract class Person {
	abstract void eat();
}

public class Ques16_ {

	public static void main(String[] args) {

		Person p = new Person() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}

}
