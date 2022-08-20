package assignment_6aug;
import java.util.Scanner;

	public class TicketMain {
	public static void main(String[] args) {
	Ticket t=new Ticket();
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Number Of Bookings: ");
	int booking=sc.nextInt();
	
	System.out.println("Enetr Available Tickets: ");
	int available=sc.nextInt();
	
	Ticket.setAvailableTickets(available);
	
	for(int i=1;i<=booking;i++)
	{
		
		System.out.println("Enter Ticket ID");
		int id=sc.nextInt();
		t.setTicketid(id);
		
		System.out.println("Enter Ticket Price");
		int price=sc.nextInt();
		t.setPrice(price);
		
		System.out.println("Enter The Tickets You Want: ");
		int want=sc.nextInt();
		System.out.println("Available Tickets: "+t.getAvailableTickets());
		
		int remaining=t.getAvailableTickets()-want;
		
		int total=t.calculateAmount(want);

		System.out.println("Total Amount Is: "+total);
		
		Ticket.setAvailableTickets(remaining);
		
		System.out.println("Available Tickets Are: "+remaining);	
	}
}
}
