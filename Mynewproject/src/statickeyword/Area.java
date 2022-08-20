/*
 Create a class to print the area of a square and a rectangle. The class has two 
 methods with the same name but different number of parameters. The method for printing
  area of rectangle has two parameters which are length and breadth respectively while the 
  other method for printing area of square has one parameter which is side of square.
 */

package statickeyword;
public class Area {
	
	void rectangle(int length,int breadth)
	{
		int rectangle_area=length*breadth;
		System.out.println("Area of rectangle is:  "+rectangle_area);
	}
	
	void square(int length)
	{
		int square_area=length*length;
		System.out.println("Area of rectangle is:  "+square_area);
	}

	public static void main(String[] args) {
		
		Area a=new Area();
		a.rectangle(10,20);
		a.square(20);

	}

}
