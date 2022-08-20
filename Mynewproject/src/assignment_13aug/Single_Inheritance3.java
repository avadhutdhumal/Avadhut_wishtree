package assignment_13aug;

 class Animal {
	 String name;
	void display()
	{
		System.out.println("Animals are wide in categories");
	}
}

 class Dog extends Animal
{
	 void show()
		{
			System.out.println("Dog Is An Animal");
			System.out.println("It Barks Very Loudly.");
			System.out.println("My Dog Name Is: "+name);
		}
}
	 public class Single_Inheritance3 {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.name="Thor";
		d.display();
		d.show();
	}

}