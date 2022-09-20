package practice_programs;

public class Assending {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 7, 18, 12 };
		
		for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			
			if(arr[i]<arr[j]) {
				int temp = arr[i];
				arr[i]=arr[j];
			arr[j]=temp;
			
			}
			
		}
		System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		for (int i = 0; i < arr.length; i=i+2) {
			System.out.print(arr[i]+" ");			
		}
	}

}
