package abstraction;

//java 8>  interface default method
interface mobile {
	String cname = "chroma";

	void show_feataures();

	int serial_no = 133323;

	default void add_extra() {
		System.out.println("camera is added as new feature");

	}

	static void show()
	{
		System.out.println("company brand is.." + cname);
//		serial_num();
	}

	static void serial_num() {
		System.out.println("serial number is..." + serial_no);
	}

}

class Samsung implements mobile {

	@Override
	public void show_feataures() {
		System.out.println("brand name is samsung");
		System.out.println("phone is galaxy");
		System.out.println("price is 50000");

	}

}

class Iphone implements mobile {

	@Override
	public void show_feataures() {
		System.out.println("brand name is iphone ");
		System.out.println("phone is iphone10");
		System.out.println("price is 650000");

	}

}

public class InterfaceWithDefault {

	public static void main(String[] args) {
		mobile m;
		m = new Samsung();
		m.show_feataures();
		m.add_extra();
		mobile.show();
		m = new Iphone();
		m.show_feataures();
		m.add_extra();
		mobile.show();

	}

}
