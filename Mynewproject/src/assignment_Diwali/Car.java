package assignment_Diwali;

public class Car implements Comparable<Car>{
	int c_id;
	String c_name;
	int c_price;
	float rating;
	@Override
	public String toString() {
		return "Car [c_id=" + c_id + ", c_name=" + c_name + ", c_price=" + c_price + ", rating=" + rating + "]";
	}
	public Car(int c_id, String c_name, int c_price, float rating) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_price = c_price;
		this.rating = rating;
	}
	@Override
	public int compareTo(Car c) {
		if(this.c_price>c.c_price)
			return -1;
		else if(this.c_price<c.c_price)
		return 1;
		else
		return 0;
	}
	

}
