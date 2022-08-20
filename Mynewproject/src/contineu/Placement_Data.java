package contineu;
import java.util.Scanner;
public class Placement_Data {
	
	int CSE,ECE,MECH;
	
		void accept()
		{
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the no of students placed in CSE:");
		             CSE= sc.nextInt();
		        System.out.println("Enter the no of students placed in ECE:");
		            ECE=sc.nextInt();
		        System.out.println("Enter the no of students placed in MECH:");
		            MECH=sc.nextInt();    
		            sc.close();
		  }
		  
		void calculate()
		{
			
		if(CSE<0||ECE<0||MECH<0)
		        {
		            System.out.println("Invalid Data");
		        }
		        
		        else if(CSE==ECE && ECE==MECH)
		        {
		            System.out.println("All departments has same placement");
		        }
		        
		        else if(CSE==ECE && MECH<CSE)
		        {
		            System.out.println("CSE & ECE has Highest placement"); 
		        }
		        
		        else if(CSE==MECH && ECE<MECH)
		        {
		            System.out.println("CSE & MECH has Highest placement");
		        }
		
		        else if(ECE==MECH && CSE<MECH)
		        {
		            System.out.println("ECE & MECH has Highest placement");  
		        }
		        
		        else if(CSE>ECE && CSE>MECH)
		        {
		            System.out.println("CSE Has Highest Placement");
		        }
		        
		        else if(ECE>CSE && ECE>MECH)
		        {  
		            System.out.println("ECE Has Highest Placement");
		        }
		        
		        else if(MECH>CSE&&MECH>ECE)
		        {
		            System.out.println("MECH Has Highest Placement");
		        }
		}
		
		public static void main (String[] args) {
		        	   Placement_Data p= new Placement_Data();
		        	  p.accept();
		        	  p.calculate();
		}
	}
