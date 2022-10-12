package library_management;

public class Book {

		 String b_name;
		 int b_id;
		 String author_name;
		 
		 	public String toString() {
		 		return "\nBook ID :" + b_id + " Book Name=" + b_name+ "Author Name:  "+author_name;
		 	}

		 	public Book()
		 	{
		 		
		 	}
		 	public Book(int b_id, String b_name,String author_name)
		 	{
		 	
		 		this.b_id= b_id;
		 		this.b_name = b_name;
		 		this.author_name=author_name;
		 	
		 }
		 
		
}
