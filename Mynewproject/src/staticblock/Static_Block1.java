package staticblock;

public class Static_Block1 {
	/*
			 static { 
			   System.out.println("I am Static block 1");
			 }
			 
			 static { 
				   System.out.println("I am Static block 2");
				 }
			public static void main(String [] args){
				
			     System.out.println("I am Static block 3");
	}

}

*/
	
	{ 
	     System.out.println("I am Instance block 1"); 
	   } 
	  { 
	    System.out.println(" I am Instance block 2"); 
	  } 
	
	 static { 
	    System.out.println("I am Static block 1"); 
	 } 
	static { 
	  System.out.println("I am Static block 2"); 
	} 
	public static void main(String [] args){
		
	     System.out.println("I am Static block 3");
	     new Static_Block1();
	}
	}