package program_Library;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

//import inherit.DateExp;
@SuppressWarnings("unused")
public class Date1 {
	
	public void issueDate() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println("*************************************************************"+"\n BOOK ISSUED ON:"+date);
	int dd=	calendar.get(Calendar.DAY_OF_MONTH);
	int mm=	calendar.get(Calendar.MONTH);
	int yy=	calendar.get(Calendar.YEAR);
		
	int add_dd=dd+7;
	int new_dd=0;

	if(add_dd>30)
	{
		new_dd=add_dd-30;
		mm=mm+2;
		System.out.println("\n RETURN BOOK IN SEVEN DAYS");
		System.out.println("RETURN BOOK ON: "+new_dd+"/"+mm+"/"+yy );
		System.out.println("**********************************************************");
	}
	else {
		System.out.println("\n RETURN BOOK IN SEVEN DAYS");	
	    System.out.println("Return date = "+add_dd+"/"+mm+"/"+yy );}
		System.out.println("\n *********************************************************");
	}
	
	}


