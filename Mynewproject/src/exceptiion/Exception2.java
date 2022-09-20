package exceptiion;

public class Exception2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int i;
		try
		{
		for( i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(arr[i]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("plz pass index within range");
		}
		
		System.out.println("rest of the code");
	}

}
