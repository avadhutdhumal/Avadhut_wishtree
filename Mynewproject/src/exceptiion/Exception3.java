package exceptiion;

public class Exception3 {

	public static void main(String[] args) {
		try
		{
			int i;
		    String s=null;
		    System.out.println(s.length());
			String s1="java";
			
			char ch=s.charAt(4);
		}
		/*catch(NullPointerException e)
		   {
			System.out.println("String cannot be null");
		   }
		catch(ArrayIndexOutOfBoundsException e1)
		   {
			System.out.println("String cannot be null");
		   }
			
		catch(Exception s)
			{
			System.out.println("plz pass in proper index range");
			}*/
		
		catch(NullPointerException|StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled");
		}
		

	}

}
