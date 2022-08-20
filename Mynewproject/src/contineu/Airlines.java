package contineu;

public class Airlines {
	String airline_name="Emirates";
	String city_bording="Pune";
	String city_reaching="Delhi";
	int fare=5500;
	
	void show()
	{
	   System.out.println("You are flying with : " +airline_name );
	   System.out.println("You are bording from : " +city_bording);
	   System.out.println("Your destination : " +city_reaching);
	   System.out.println("Your total fares are : " +fare);
	}

	public static void main(String[] args) {
		Airlines a=new Airlines();
		a.show();
	}
}
