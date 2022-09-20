package array;
//1234
public class Maximum {

	public static void main(String[] args) {
		int arr[]= {1,5,7,23,11};
		
	int max=arr[0];//1
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];//5 7 23 
			}
		}
		System.out.println(max);		
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];//1 5 7 23 
			}
		}
		System.out.println(min);
		
		

	}

}
