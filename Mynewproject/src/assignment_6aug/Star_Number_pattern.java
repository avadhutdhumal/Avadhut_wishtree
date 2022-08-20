package assignment_6aug;

public class Star_Number_pattern {

	public static void main(String[] args) {
		 int i, j;
		    System.out.println("*");
		    for(i=1; i<=5; i++)
		    {
		    	System.out.print("*");
		        for(j=1; j<=i; j++)
		        {
		        	System.out.print(j);
		        }

		        for(j=i-1; j>=1; j--)
		        {
		        	System.out.print(j);
		        }
		        System.out.print("*");
		        System.out.println();
		     
		    }

		    for(i=5-1; i>=1; i--)
		    {
		    	System.out.print("*");
		        for(j=1; j<=i; j++)
		        {
		        	System.out.print(j);
		        }

		        for(j=i-1; j>=1; j--)
		        {
		        	System.out.print(j);
		        }
		        System.out.print("*");
		        System.out.println();
		    }
		    System.out.print("*");
		}

	}
