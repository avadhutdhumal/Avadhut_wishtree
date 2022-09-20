package practice_programs;

class Manager{
	
		static String cname="TATA";
		String name;
		int id;
		
		Manager(int id, String name) 
		{
			
			this.id=id; 
			this.name=name;
			System.out.println("Name: "+name + "ID :"+id +" Cname: " +cname);
		}
		
}

public class Static_Example {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Manager e= new Manager(121, "Omk");
		Manager e1= new Manager(111, "AJ");
		
	}

}
