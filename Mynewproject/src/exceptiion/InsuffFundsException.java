package exceptiion;
public class InsuffFundsException extends Exception
{
	String errMasg;
	public InsuffFundsException() {
		// TODO Auto-generated constructor stub
	}
	public InsuffFundsException(String str)
	{
		errMasg = str;
	}
	public String getMessage()
	{
		return errMasg;
	}


}
