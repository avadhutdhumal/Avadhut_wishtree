package array;

public class Replace_Num {

	public static void main(String[] args) {
		int i;
		int array[] = { 72, 69, 76, 76, 79 };
		for (i = 0; i < array.length; i++) 
		{
			if (array[i] % 10 == 9) 
			{
				array[i] = 0;
			}
		}
		for (i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}

}
