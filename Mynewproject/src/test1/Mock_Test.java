package test1;
public class Mock_Test {

	public static void main(String[] args) {
		int arr[] = {15,23,46,22,78,90,25};

		int s=65;
		int min=Math.abs(s-arr[0]);
		int num=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			int sub =Math.abs(s - arr[i]);
			if (sub < min)
			{
				min=sub;
				num=arr[i];
			}
		
		}
		System.out.println("Closest Number to S IS:"+num);
		
	}
}