package assignment_27_Aug;

public class Even_Odd {

	public static void main(String[] args) {

		int arr[] = { 12, 34, 45, 9, 8, 90, 3 };

		int left = 0, right = arr.length - 1;
		
		while (arr[left] % 2 == 0) 
		{
			left++;
		}
		while (arr[right] % 2 == 1)
		{
			right--;
		}
		if (left < right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
