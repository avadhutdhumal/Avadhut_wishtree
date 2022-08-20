package revision;

import java.util.Scanner;

public class Pallindrom {
	int num;
		
	@SuppressWarnings("resource")
	void check()
	{
		for (int i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number: ");
			num=sc.nextInt();
			
			 int sum = 0, r;
			 int pal = num; 
			 
		     while(num>0)
			   {    
		        r = num % 10;   
		        sum = (sum*10)+r;    
		        num = num/10;    
		       }   
		     
		      if(pal==sum)    
		      {
		        System.out.println("Palindrome number.");    
		      }
		        else
		        { 	
		     System.out.println("Not a palindrome"); 
		        }
		      
	            if(num<0)
	 	    	   break;
	        }
		}	
	
	public static void main(String[] args) {
		Pallindrom p=new Pallindrom();
		p.check();

	}

}
