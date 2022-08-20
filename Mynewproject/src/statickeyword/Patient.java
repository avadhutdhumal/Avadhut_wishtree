package statickeyword;
import java.util.Scanner;

public class Patient {
	
		static String  clinic_name;
		String p_name;
		String doc_name;
		int age;
		float weight;
		String b_group;
		
		void accept()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter clinic name");
			 clinic_name=sc.next();
			System.out.println("Enter patient name");
			p_name=sc.next();
			System.out.println("Enter doctor name");
			doc_name=sc.next();
			System.out.println("Enter age");
			age=sc.nextInt();
			System.out.println("Enter weight");
			weight=sc.nextFloat();
			System.out.println("Enter blood group");
			b_group=sc.next();
			sc.close();
		}
		
	
	

		void display()
		{
			System.out.println("clinic_name is..."+clinic_name);
			System.out.println("patient_name is..."+p_name);
			System.out.println("doc_name is..."+doc_name);
			System.out.println("age is..."+age);
			System.out.println("b_group is..."+b_group);
		}
		
	/*void check()
	{
		if(age>18)
		{
			if(weight>50)
			{
			System.out.println("he is eligible to donate blood");
		}
			
		
			else
				System.out.println("he is  not eligible to donate blood");
		}
				
	}*/
	
			float  weight()
			{
			return weight;
			}
			
			int age()
			{
				return age;
			}

			public static void main(String[] args) {
				Patient p=new Patient();
				p.accept();
				p.display();
				Patient p1=new Patient();
				p1.accept();
				p1.display();
			//	p.check();

	}

}
