package assignment_6aug;

public class Book {
	
	private String bookName;
	private int bookPrice; 
	private String authorName;

	
	 public String getbookName() 
	 { 
		 return bookName;
	 }
	 public void setbookNmae(String bookname)
	 {
		 this.bookName=bookname;
	 }
	 
	 public int getbookPrice()
	 {
		 return bookPrice;
	 }
	 
	 public void setbookPrice(int bookPrice)
	 {
		 this.bookPrice=bookPrice;
	 }
	 
	 public String getauthorName()
	 {
		 return authorName;
	 }
	 
	 public void setauthorName(String authorName)
	 
	 {
		 this.authorName=authorName;
	 }
	 
	public static void main(String[] args) {
		Book bk=new Book();
		bk.setbookNmae("The 5 AM Club");
		bk.setauthorName("Robin Sharma");
		bk.setbookPrice(250);
		System.out.println("Book Name is: " +bk.getbookName());
		System.out.println("Author Name is: " +bk.getauthorName());
		System.out.println("Book Price is: "+bk.getbookPrice());
		

	}
}
