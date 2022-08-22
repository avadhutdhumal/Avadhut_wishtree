package assignment_21_Aug;


class Parent {
	
    final void show()
    {
    	System.out.println("Parents are Respectful.");
    }
}

class Child extends Parent {
	
	void show1()
	{
		System.out.println("Childrens must respest their parents.");
	}

}

public class Final_Method {

	public static void main(String[] args) {
		Child c= new Child();
		c.show();
		c.show1();

	}

}
