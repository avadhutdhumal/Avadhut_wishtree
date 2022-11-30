package written_Test1;

public class Ques6 {

	public static void main(String[] args) {
		int arr[][] = { { 2, 4, 9, 7 }, { 6, 5, 3, 10 }, { 7, 3, 6, 4 } };

		int max = 0;
		int avg = 0;
		int sum;
		for (int i = 0; i < 4; i++) {
			sum = 0;
			for (int j = 0; j < 3; j++) {

				if (arr[j][i] > max) {
					max = arr[j][i];
				}

				sum = sum + arr[j][i];
			}
			avg = sum / 3;
			System.out.println("\nAvg of Colomn "+i+": " + avg);
		}

		System.out.println("\nMax Element Is: " + max);
	}

}
//    1  2   3
/*
 * i1 2 6 7 2 4 5 3 3 9 3 6 4 7 10 4
 */
