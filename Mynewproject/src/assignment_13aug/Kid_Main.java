package assignment_13aug;

class Kid {
	int pages;
	String name;
	
	void readBook()
	{
		System.out.println("Read Books To Gain Knowledge");
	}
	
	void readBook(int pages, String name)
	{
		this.pages=pages;
		this.name=name;
		System.out.println("Book Name: "+name);
		System.out.println("Books Pages: "+pages);
	}
	
}
	class BigKid extends Kid
	{
		void readBook()
		{
			System.out.println("BigKid:Read Books To Gain Knowledge");
		}
	}
	
	class Teenager extends Kid{
		
		void readBook() 
		{
			System.out.println("Teenager: Read Books To Gain Knowledge");
		}
	}
	public class Kid_Main {
		
	public static void main(String[] args) {
		
		Kid k = new Kid();
		k.readBook();
		System.out.println();
		k.readBook(230, "IKIGAI");
		System.out.println();
		BigKid k1=new BigKid();
		k1.readBook();
		System.out.println();
		Teenager k2=new  Teenager();
		k2.readBook();
		
	}
	}
