package assignment_17Sept;

abstract class Car{
	abstract void speed();
}

public class Anonymus_Abstarct {

	public static void main(String[] args) {
		Car c =new Car() {
			
			@Override
			void speed() {
				System.out.println("I am BMW: My Speed Is 200kmph");
			}
		};
	c.speed();
	}
	

}
