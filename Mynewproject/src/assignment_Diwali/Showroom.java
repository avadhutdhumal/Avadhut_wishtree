package assignment_Diwali;

public class Showroom {
	String s_name;
	String s_location;
	Car c;
	public Showroom(String s_name, String s_location, Car c) {
		super();
		this.s_name = s_name;
		this.s_location = s_location;
		this.c = c;
	}
	@Override
	public String toString() {
		return "Showroom [s_name=" + s_name + ", s_location=" + s_location + ", c=" + c + "]";
	}

	
}
