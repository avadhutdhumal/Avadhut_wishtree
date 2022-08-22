package assignment_21_Aug;

interface IceCream {
	void eat();

}

interface Juice {
	void drink();
}

class Mastani implements IceCream, Juice {

	@Override
	public void eat() {
		System.out.println("Welcome to Natural's Icecream");
		System.out.println("Butter Scotch Icecream Is BestSeller Here");
	}

	@Override
	public void drink() {
		System.out.println("Welcome to Maharaja Juice Center");
		System.out.println("Orange Juice Is BestSeller Here");
	}
}

public class Icecream_Main {
	public static void main(String[] args) {
		 
		IceCream i;
		i=new Mastani();
		i.eat();
		System.out.println();
		Juice j;
		j=new Mastani();
		j.drink();
		
		

	}
}
