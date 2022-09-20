package assignment_string_array;

public class Merge {

	public static void main(String[] args) {
		int arr1 []={1,3,5,7,9};
		int arr2 []={2,4,8,10,11,12,16};
		int index=arr1.length+arr2.length;
		int arr3[]=new int[index];
		int count=0;
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i]=arr1[i];
			count++;
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[count++]=arr2[i];
			index++;
		}
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				if(arr3[i]<arr3[j])
				{
					int temp=arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr3.length; i++) 
		{
			System.out.print(arr3[i]+" ");
		}
	}

}
