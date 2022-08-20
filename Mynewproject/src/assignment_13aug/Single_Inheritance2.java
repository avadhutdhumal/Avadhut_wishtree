package assignment_13aug;

class Fruit {
	
	  String name;
	  public void prop() 
	  {
	    System.out.println("Fruits are Sweet or Sour");
	  }
	}

	class Mango extends Fruit {

	  public void display() 
	  {
	    System.out.println("I am sweet and my name is: " + name);
	  }
	}
	
public class Single_Inheritance2 {
	

	public static void main(String[] args) {
		Mango m=new Mango();
		m.name="Mango";
		m.prop();
		m.display();
	}

}
