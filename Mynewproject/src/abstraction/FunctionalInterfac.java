package abstraction;
//functional interface which has only and only one method
//Runnable run();
@FunctionalInterface 
interface cake
{
	 
	void baking();
	
}

class Strawberry implements cake
{

	@Override
	public void baking() {
		System.out.println("Strawberry cake available");
		
	}
	
}
public class FunctionalInterfac {

	public static void main(String[] args) {
		cake c=new Strawberry();
		c.baking();
		
		
		//cake c1=()->{System.out.println("Strawberry cake available");};
		//c1.baking();

	}

}
