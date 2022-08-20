package statickeyword;
class Police{
	
	static String stationname;
	int p_id;
	String name;
	String post;
	String area;
	
	public Police(int p_id,String name,String post,String area)
	{
		this.name=name;
		this.p_id=p_id;
		this.post=post;
		this.area=area;
	}
	
	void display ()
	{
		
		System.out.println(p_id+ "   " +name+  "  "  +post+  "   " +area);
		
	}
}
public class Police_Station {

		public static void main(String[] args) {
			
			Police.stationname="Mumbai Police";
			System.out.println(Police.stationname);
			Police p1= new Police(1001,"Akash","SP","Bhandup");
			p1.display();
			Police p2= new Police(1002,"Ishwar","DYSP","Kurla");
			p2.display();
			Police p3= new Police(1003,"Vishnu","PSI","Palghar");
			p3.display();
			Police p4= new Police(1004,"Shubham","SI","Virar");
			p4.display();
			Police p5= new Police(1005,"Suraj","Constable","Diga");
			p5.display();
	}

}
