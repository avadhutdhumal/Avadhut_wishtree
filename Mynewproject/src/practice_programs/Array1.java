package practice_programs;

public class Array1 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		
		int [][]arrcopy=new int[arr.length][];
		
		arrcopy=arr;
		
		
		for (int i = 0; i < arrcopy.length; i++){
			for (int j = 0; j < arrcopy[i].length; j++) {
				System.out.print(arrcopy[i][j]+" ");
			}
			
		}
	}

}
