package array;

public class Replace_Num2 {

	public static void main(String[] args) {
		int i;
		int array[] = { 72, 69, 76, 76, 79 };
		int min=array[0];
		for (i = 0; i < array.length; i++) 
		{
			if (array[i] <min) 
			{
				min=array[i];
				int second_min=array[i+1];
				
				System.out.println(second_min);			
			}
			
		}
		System.out.print("\n"+min);
		System.out.print("\n");
		for (i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}

}
