package assignment_13aug;

public class Example {

	public static void main(String[] args) {
		int num=45678;
		
		int a;
		int dig;
		int res=0;
		
		a=num;
		
		while(a>0)	
		{
			dig=a%10;
			res=res+(dig*dig*dig);
			a=a/10;
		}
		if (num==res)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}

}
