package assignment_13aug;

class Samsung
{
	String tname;
	String fname;
	int tprice;
	int fprice;
	void gadet()
	{
		System.out.println("Samsung is Best Brand For Electronic Products.");
	}
	}

class Tv extends  Samsung{
	
	void display()
	{
		System.out.println("Samsung Tv's are Best Known for its Display Quality.");
		System.out.println("Best Tv Now is: "+tname);
		System.out.println("Tv Cost is : "+tprice);
	}
}

class Fridge extends Samsung{
	void display1()
	{
		System.out.println("Samsung Also Deliver Good Quality Fridge");
		System.out.println("Best Fidgge Now is: "+fname);
		System.out.println("Fridge Cost is : "+fprice);
	}
}
public class Hierarchical_Inheritance1 {

	public static void main(String[] args) {
		Fridge f=new Fridge();
		f.gadet();
		f.fname="Twin Cooling Plus";
		f.fprice=38000;
		f.display1();
		
		Tv t=new Tv();
		t.tname="Crystal_4k";
		t.tprice=32000;
		t.display();
		
	}

}
