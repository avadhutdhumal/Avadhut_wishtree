/*
 Create a class Car with String model and inttotalCarSold as static variable 
in main() method.
Change the value of variable by class name then Print it.

Create two object of Car class and change value of static variable by 1st object and print it by accessing 2nd object.
Check following variations:

Static variable and Non-Static (Instance Variable) – Just declare and print it.

See if you can access static variable in static method
non static variable in static method
then static variable in non-static method
non static variable in non-static method. */

package assignment_6aug;

public class Car {
	
	static String model;
	int totalCarSold;
		
		void show()
		{
		System.out.println(model);		
		System.out.println(totalCarSold);		
		}
		
		public static void main(String[] args) {
			Car a=new Car();
			model="Santro";
			
			a.totalCarSold=10;
			System.out.println("Model Name: "+Car.model);
			System.out.println("Total Car Sold: "+a.totalCarSold);
			
			Car a1=new Car();
			a1.totalCarSold=15;
			System.out.println("Model Name: "+model);
			System.out.println("Car Sold: "+a.totalCarSold);
			a.show();
		}

}

