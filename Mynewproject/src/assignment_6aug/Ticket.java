package assignment_6aug;

public class Ticket {
	private int ticketid;
private	int price;
private	static int availableTickets;//25


public int getTicketid() {
	return ticketid;
}
public void setTicketid(int ticketid) {
	this.ticketid = ticketid;
}

public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}   

public static void setAvailableTickets(int  availableTickets)
{
	Ticket.availableTickets=availableTickets;
}

public int getAvailableTickets()
{
	return Ticket.availableTickets;

}

 int calculateAmount(int no_of_tickets)
{
	int amount=price*no_of_tickets;
	
	if(no_of_tickets>getAvailableTickets())
	{
		System.out.println("Available tickets"+getAvailableTickets());
		System.out.println("Sorry We dont have that much Tickets! so amount cannot be calculated");
		return -1;
	}
	else
		return amount;
}
}