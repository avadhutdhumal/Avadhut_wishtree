package practice_programs;

class Manager11 {

	static String cname = "TATA";
	String name;
	int id;

	Manager11(int id, String name) {

		this.id = id;
		this.name = name;
//		System.out.println("Name: " + name + "ID :" + id + " Cname: " + cname);
	}
	
	public String toString()
	{
		return name + " " +id +"  " + cname;
		
	}

}

public class ToString {

	public static void main(String[] args) {
		Manager11 e = new Manager11(121, "Omk");
		System.out.println(e);
		Manager11 e1 = new Manager11(111, "AJ");
		System.out.println(e1);
	}

}
