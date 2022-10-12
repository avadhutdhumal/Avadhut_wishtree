package program_Library;

public class Book {
	int b_id;
	String b_name;
	String author;
	int price;
	int no_of_copies;
	Department d;

	public Book(int b_id, String b_name, String author, int price, int no_of_copies, Department d) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.author = author;
		this.price = price;
		this.no_of_copies = no_of_copies;
		this.d = d;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNo_of_copies() {
		return no_of_copies;
	}

	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return b_id + " " + b_name + " " + author + " " + no_of_copies + " " + d;

	}

}
