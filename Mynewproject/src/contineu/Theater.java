package contineu;

public class Theater {
	String theater_name="PVR";
	String movie_name="MARVEL";
	int ticket_price=300;
	// Please select coupon 1.Gold  2. Silver 3.Bronze
	int coupon=2;	
	
	void calculate()
	{
		if(coupon==1)
		{
			int dics_price = (int) (ticket_price-(ticket_price*0.10));
			System.out.println("Congratulations! You have got 10 % discount.");
			System.out.println("Your Ticket Price is: "+dics_price);
		}
		else if(coupon==2)
		{
			int dics_price = (int) (ticket_price-(ticket_price*0.07));
			System.out.println("Congratulations! You have got 7 % discount.");
			System.out.println("Your Ticket Price is: "+dics_price);
		}
		else if(coupon==3)
		{
			int dics_price = (int) (ticket_price-(ticket_price*0.05));
			System.out.println("Congratulations! You have got 5 % discount.");
			System.out.println("Your Ticket Price is: "+dics_price);
		}
		else {
			System.out.println(" Sorry no dicount Your Ticket Price is: "+ticket_price);
			}
		}
		
	public static void main(String[] args) {
		Theater t= new Theater();
		t.calculate();

	}

}
