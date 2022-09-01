package practice_array;



public class Mock {

	public int id;
	public String name;
	public String address;
	public int contact;
	
		public Mock(int id, String name)
		{
			this.id=id;
			this.name=name;
		}
		
		public Mock(String address)
		{
			this(123,"Suraj");
			this.address=address;
		}
		
		public Mock(int contact)
		{
			this("Pune");
			this.contact=contact;
		}
	
	public static void main(String[] args) {
		
		Mock m=new Mock(4500);
		System.out.println(m.address);
		System.out.println(m.contact);
		System.out.println(m.id);
		System.out.println(m.name);
	}

}
