package abstraction;

//concrete method:whose body is created
//abstractmethod: whose body is not there
// and whose body has to be created by subclass.
abstract class Television {
	@SuppressWarnings("unused")
	private int icnumber = 1234;
	static final int size = 50;

	Television() {

		System.out.println("Telsvision details");
	}

	void show()// concreate
	{
		System.out.println("showing television details");
	}

	abstract public void specfic_Implementa();

}

class Sony extends Television {
	Sony(String str) {

	}

	@Override
	public void specfic_Implementa() {
		System.out.println("brand name is sony");
		System.out.println("Screen 12*12");
		System.out.println("android");

	}

}

public class AbstractMain {

	public static void main(String[] args) {
		Television t = new Sony("Sony");
		t.show();
		t.specfic_Implementa();

	}

}
