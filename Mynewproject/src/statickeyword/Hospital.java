package statickeyword;
class Hospital_Data {
	
	static String hospital1;
	int dailnum; 
	String department;
	String doctorname;
	
	public Hospital_Data(int dailnum,String department,String doctorname)
	{
		this.dailnum=dailnum;
		this.department=department;
		this.doctorname=doctorname;
	}
	
	void display()
	{
		
		System.out.println(dailnum+" " +doctorname+ " " +department);
	}
}
	public class Hospital {
			public static void main(String[] args){
				
				Hospital_Data.hospital1 ="Apollo Hospital";
				System.out.println(Hospital_Data.hospital1);
				
				Hospital_Data h1=new Hospital_Data(101, "Cardiology", "Dr.Strange");
				h1.display();
				Hospital_Data h2=new Hospital_Data(102, "Orthology", "Dr.Steve");
				h2.display();
				Hospital_Data h3=new Hospital_Data(103, "Oncology", "Dr.David");		
				h3.display();		
			}
		}
