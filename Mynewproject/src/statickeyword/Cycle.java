/*Create a class Cycle with member variables: int accountNo, int noOfWheels
a. Create a default constructor with a write in it “I am default constructor”
b. Create another constructor which takes 2 arguments, calls the default constructor using 
this keyword and has a print in it “I am another constructor”.
c. In main method, create an object of type Cycle by using default constructor(Note the output)
d. Create another object of type Cycle by using the parameterized constructor( Note the sequence
 of print indicating that inner most constructor is called first)
*/

package statickeyword;
public class Cycle {

	int accountNo; int noOfWheels;
	
	Cycle() //default constructor
	{
		System.out.println("I am Default Constructor");
	}
	
	Cycle(int accountNo,int noOfWheels)
	{
		this.accountNo=accountNo;
		this.noOfWheels=noOfWheels; 
		System.out.println("I am another Constructor");  
	}
	
	void display()
	{
		System.out.println(accountNo+"   "+noOfWheels);
	}

	public static void main(String[] args) {
			@SuppressWarnings("unused")
			Cycle c=new Cycle();
			Cycle c1=new Cycle(101,2);
			c1.display();
			Cycle c2=new Cycle(102,2);
			c2.display();
			Cycle c3=new Cycle(103,2);
			c3.display();
	}
}
