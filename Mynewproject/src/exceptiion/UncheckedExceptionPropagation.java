package exceptiion;
public class UncheckedExceptionPropagation
{
	public void task3()
	{
		int b = 9;
		int c = 0;
		float d = b/c;
		System.out.println("Division is :"+d);
	}
    
	public void task2()
	{
		task3();
	}
	public void task1()
	{
		try
		{
		task2();
		}
	  	catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception propagated from task2 and handled "
					+ "here in task1");
			System.out.println("Exception type : " + e.getClass());;
			System.out.println("Error Message : " + e.getMessage());
		}
		
	}
	
	public static void main(String[] args)
    {
	    UncheckedExceptionPropagation o = new UncheckedExceptionPropagation();
	  o.task1();
	  	

	}

}
