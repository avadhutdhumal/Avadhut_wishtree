package inheritance;

public class Printer {
	
		String pBrand;
		String colour;
		int price;
		public Printer(String pBrand, String colour, int price) {
		
			this.pBrand = pBrand;
			this.colour = colour;
			this.price = price;
		}
		
		void show()
		{
			System.out.println("printer brand is.."+pBrand);
			System.out.println("printer color is..."+colour);
			System.out.println("printer price is..."+price);
		}
		

	}
