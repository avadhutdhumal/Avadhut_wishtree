package pattern;

/*
 	 1 
    121 
   12312 
  1234123 
 123451234 

 */
public class Number_Pattern4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int sp=4;sp>=i;sp--)
				{
					System.out.print(" ");
				}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=1;j<i ;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}
