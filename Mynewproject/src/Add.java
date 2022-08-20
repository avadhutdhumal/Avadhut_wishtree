
public class Add {

	public static void main(String[] args) {
		 	int a=123456;
	        int add=0;
	        
	      
	    while (a>0)
	        {
	            int i=a%10;
	            
	                if (i%2==0)
	                {
	                    add=add+i;
	                }
	                
	            a=a/10;
	        }    
	    
	    System.out.println(add);
	    
	    }
	}