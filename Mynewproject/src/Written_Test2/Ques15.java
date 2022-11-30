package Written_Test2;

public class Ques15 {

	public static void main(String[] args) {
//		int arr[][] = new int[][] { {12,34,2,4}, {2,90,11,0},{ 6,19,7,9},{ 66,41,22,3}};
		int arr[][] = new int[][] { { 1,2,3}, { 4,5,6}, { 7,8,9}};
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || j == 0 || i == arr.length - 1 || j == arr[i].length - 1) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
