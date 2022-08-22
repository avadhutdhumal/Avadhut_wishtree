package assignment_21_Aug;

	interface Cake{
		void bake();
	}
	
	class Strawberry implements Cake
	{
		@Override
		public void bake() {
			{
				System.out.println("Welcome To HomeBaker ");
				System.out.println("Flavor is Strawberry Cake");
				System.out.println("Price For Strawberry Cake Is 800/Kg ");
			}
		}	
	}
	
	class BlackForest implements Cake
	{
		@Override
		public void bake()
		{
			System.out.println("Welcome To HomeBaker ");
			System.out.println("Flavor is BlackForest Cake");
			System.out.println("Price For BlackForest Cake Is 600/Kg ");
		}
		
	}
public class Cake_Main {

	public static void main(String[] args) {
		
		Cake c;
		c=new Strawberry();
		c.bake();
		System.out.println();
		c=new BlackForest();
		c.bake();

	}

}
