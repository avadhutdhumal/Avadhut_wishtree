package statickeyword;

public class Student {
	
		String name;
		int age;
		String address;
		
		void set_Info(String name,int age)
		{
			this.name=name;
			this.age=age;
		}
		
		void set_Info(String name,int age,String addres)
		{
			this.name=name;
			this.age=age;
			this.address=addres;
		}
	
		void display()
		{
			System.out.println("Name:  "+name +"     "+"Age: "+age+"   "+ "Address:   " +address);
		}
	
	public static void main(String[] args) {
			Student s=new Student();
			s.set_Info("Akash",25);
			s.set_Info("Akash",25,"Kolhapur");
			s.display();
			Student s1=new Student();
			s1.set_Info("Suraj",25);
			s1.set_Info("Suraj",25,"Ichalkarnji");
			s1.display();
	}

}
