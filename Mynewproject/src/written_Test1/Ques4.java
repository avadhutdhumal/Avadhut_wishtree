package written_Test1;

public class Ques4 {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 0, 6, 0, 4 };
		int len = arr.length, i;
		int k = 0;

		//non zero items adding first
		for (i = 0; i < len; i++) {
			if (arr[i] != 0) {
				arr[k++] = arr[i];
			}
		}

		// adding zeros remaining elements
		while (k < len)
		{
			arr[k++] = 0;
		}

		for (int j = 0; j < len; j++) 
		{
			System.out.print(arr[j] +" ");
		}
	}

}
