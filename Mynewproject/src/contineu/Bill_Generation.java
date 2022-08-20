package contineu;
import java.util.Scanner;
public class Bill_Generation {
	 int piz,puf,cdk,total;
	 
		void acceept() 
		{
		      Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the no of pizzas bought:");
		       piz=sc.nextInt();
		        System.out.println("Enter the no of puffs bought:");
		        puf=sc.nextInt();
		        System.out.println("Enter the no of cool drinks bought:");
		       cdk=sc.nextInt();
		       sc.close();
		}  
		
		void calculate() 
		{
		       total=piz*100+puf*20+cdk*10;
		}        
		
		void show() 
		{
		        System.out.println("No of pizzas: "+piz);
		        System.out.println("No of puffs: "+puf);
		        System.out.println("No of cooldrinks: "+cdk);
		        System.out.println("Total price is = " +total);
		       
		}
		        public static void main(String[] args) {
		        	Bill_Generation b= new Bill_Generation();
		        	b.acceept();
		        	b.calculate();
		        	b.show();
		        	
		    }
	}

