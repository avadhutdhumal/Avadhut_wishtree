package practice_programs;

class Cov1 {
	Cov1 display() {
		return new Cov1();

	}
}

class Cov2 extends Cov1{
	Cov2 display() {
		return new Cov2();

	}
}

public class Cov {

	public static void main(String[] args) {
		Cov2 c= new Cov2();
		c.display();
	}

}
