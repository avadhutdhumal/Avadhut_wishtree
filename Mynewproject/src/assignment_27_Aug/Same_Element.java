//Write a program to check if elements of an array are same or not 
package assignment_27_Aug;

public class Same_Element {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 15, 15, 3, 2 };
		int i, j;
		boolean visited;
		for (i = 0; i < arr.length; i++) {

			visited = false;
			for (j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " " + "And" + " " + arr[j] + " " + " Are Same");
				}
			}

			if (visited == true) {
				System.out.println(arr[i] + "And" + arr[j] + "Are Same");
			}
		}
	}

}
