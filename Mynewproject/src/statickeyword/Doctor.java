package statickeyword;

public class Doctor {

	public static void main(String[] args) {
		Patient p=new Patient();
		p.accept();
	//	p.check();
		
		float weight=p.weight();
		int age=p.age();
		if(age>18)
		{
			if(weight>=50)
			{
			System.out.println("he is eligible to donat blood");
		}
			
		
			else
				System.out.println("he is  not eligible to donat blood");
		}
		
	}

}
