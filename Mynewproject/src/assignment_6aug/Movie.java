package assignment_6aug;

public class Movie {
	
		private  String movieName;
	    private String movieCategory;
	    private int ticketCost;

	    public String getmovieName()
	    {
	    	return movieName;
	    }
	    
	    public void setmovieName(String movieName)
	    {
	    	this.movieName=movieName;
	    }
	    
	    public String getmovieCategory()
	    {
	    	return movieCategory;
	    }
	    public void setmovieCategory(String movieCategory)
	    {
	    	this.movieCategory=movieCategory;
	    }
	    
	    public int getticketCost()
	    {
	    	return ticketCost;
	    }
	    public void setticketCost(int ticketCost)
	    {
	    	this.ticketCost=ticketCost;
	    }
	    
	public static void main(String[] args) {
		Movie mo=new Movie();
		mo.setmovieName("Phir Hera Pheri");
		mo.setmovieCategory("Comedy");
		mo.setticketCost(120);
			
		System.out.println("Movie Name is: "+mo.getmovieName());
		System.out.println("Category is: "+mo.getmovieCategory());
		System.out.println("Ticket Price is: "+mo.getticketCost());
	}

}
