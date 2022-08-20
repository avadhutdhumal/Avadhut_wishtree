package revision;
public class Krishnmurthy_Number {
	
	//function for calculating factorial
	
	static int factorial (int num)
	{
		int fact=1;
		while (num!=0)
		{
		fact = fact * num;
		num--;
		}
		return fact;
	}
	
	// function to check krishnamurthy number 
	
	static boolean Krishnmurthy (int num)
	{
		 int sum = 0;
		 int m = num;
         while (m!=0)
         {
              sum += factorial(m%10);
              m=m/ 10;
         }
         return (sum==num); 	
	}
	
	
	public static void main(String[] args) {
		
		        int num=145;
		        if ( Krishnmurthy(num))
		              System.out.println ("Yes! Number is Krishnmurthy");
		         else
		              System.out.println ("No number is not Krishnmurthy.");
	}

}
