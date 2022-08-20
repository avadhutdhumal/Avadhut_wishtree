package staticblock;
public class Access_Modifier {
	
	@SuppressWarnings("unused")
	private int i=10;
	int j=200;
	protected int k=25;
	public int m=50;
	
}
	class A 
	{
		
		void display()
		{
			Access_Modifier as= new Access_Modifier();
			
		//	System.out.println(as.i); // I cannot be printed because its private
			System.out.println(as.j);
			System.out.println(as.k);
			System.out.println(as.m);
			}
	}
	
	class B extends Access_Modifier{
		
		void display()
		{
			Access_Modifier as= new Access_Modifier();
			
			// System.out.println(as.i); I cannot be printed because its private
			System.out.println(as.j);
			System.out.println(as.k);
			System.out.println(as.m);
			}
		
	}
	

