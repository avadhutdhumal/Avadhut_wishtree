//Write a java program to separate zeros from non-zeros in an integer array

package assignment_27_Aug;

public class Seprate_Zero {

	public static void main(String[] args) {
		int arr[] = { 12, 0, 7, 0, 8, 0, 3 };

		int len = arr.length - 1, i;

		for (i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[len] = arr[i];
				len--;
			}
		}

		while (len >= 0)
		{
			arr[len] = 0;
			len--;
		}

		for (i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
	}
}
