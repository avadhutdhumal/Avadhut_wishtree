package hashmap;

public class Course {

	int c_id;
	String c_name;
	Integer price;
	public Course(int c_id, String c_name, int price) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", price=" + price + "]";
	}
	

}
