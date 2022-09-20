package exceptiion;
public class DivisionExample {

	public void divide(int x,int y)
	{
		float ans = x/y;
		System.out.println("Division is : " + ans);
	}
	
	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		DivisionExample o = new DivisionExample();
		o.divide(a, b);
	
		System.out.println("Addition is : " + (a+b));
		System.out.println("Multiplication is : " + (a*b));
		


	}

}
