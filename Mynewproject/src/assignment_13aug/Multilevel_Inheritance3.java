package assignment_13aug;

class Gadget{
	String gname;
	int gprice;
	void show()
	{
		System.out.println("E-Gadgets Are Important For Human Life.");
	}
		}

class Ac extends Gadget{
	void show1()
	{
		System.out.println("Ac Provides Cooling To Humans.");
		System.out.println("Popular AC Brand Is: "+gname);
	}
	}

class Voltas extends Ac{
	void show2()
	{
		System.out.println("Voltas AC Cost For: "+gprice);
	}
}

public class Multilevel_Inheritance3 {

	public static void main(String[] args) {
		Voltas v=new Voltas();
		v.gname="Voltas";
		v.gprice=35000;
		v.show();
		v.show1();
		v.show2();
				

	}

}
