package array;

public class SumOfEven {

	public static void main(String[] args) {
		//sum of even elements
		int arr[]= {11,2,12,9,3,4};
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
		
	}

}
