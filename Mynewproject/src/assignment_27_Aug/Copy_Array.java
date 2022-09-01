package assignment_27_Aug;


public class Copy_Array {

	public static void main(String[] args)
	{
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		int[][] arrcopy = new int[arr.length][];
		arrcopy = arr;
		
		
	          System.out.println("Original Elements:");
	          for (int i=0; i<arr.length; i++){
	            for (int j=0; j<arr[i].length; j++){
	               System.out.print(arr[i][j] + " ");
	            }
	        }
	          
	          System.out.println("Copied Elements:");
	          for (int i=0; i<arr.length; i++){
	            for (int j=arrcopy[i].length-1;j>=0; j--){
	               System.out.print(arrcopy[i][j] + " ");
	               
	            }
			}
		}
}
