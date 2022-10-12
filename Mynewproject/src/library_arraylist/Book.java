package library_arraylist;

public class Book {
	int b_id;
	String name;
	int price;
	String author_name;
	
	public Book(int b_id, String name, int price, String author_name) {
		super();
		this.b_id = b_id;
		this.name = name;
		this.price = price;
		this.author_name = author_name;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

}
