package practice_programs;

public class Cov22 {

	public static void main(String[] args) {
		

		int arr[]= {25,16,32,52,14,25};
		int sum=0;
		for (int i = 0; i+1 < arr.length; i++)
        {
			if(arr[i]%2==0)
				
				System.out.print(arr[i]+" ");
        }
		System.out.println("\n");
		for (int i = 0; i+1 < arr.length; i++)
        {
			 sum = arr[i] + arr[i + 1];
           System.out.print(sum + " ");
       }
	}

}
