package assignment_string_array;

public class Leader_Element {

	public static void main(String[] args) {
		int arr[]= {92,7,12,9,8,3};
		
		
		for (int i = 0; i < arr.length; i++) {
			boolean flag =false;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<=arr[j])
				{
					flag=true;
				}
			}
			if(flag==false)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
