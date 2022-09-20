package exceptiion;

public class Mock {

	public static void main(String[] args) {
		int a =18;
		
		int arr[] = { 10, 22, 15, 20, 25 };
		int min = Math.abs(a-arr[0]);
		int num=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			int sub =Math.abs(a - arr[i]);

			if (sub < min)
			{
				min=sub;
				num=arr[i];
			}
		
		}
		System.out.println(num);
		
	}
}
