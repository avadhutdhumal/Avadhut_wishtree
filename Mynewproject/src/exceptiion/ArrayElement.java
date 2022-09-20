package exceptiion;

public class ArrayElement {

	public static void main(String[] args) {

		int a[] = { 12, 27, 25, 44, 23, 11 };
		int num = 24;

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		for (int i = 0; i < a.length - 1; i++) {
			// System.out.println(a[i]);
			int sub = a[i + 1] - a[i];
			int rem = sub / 2;
			if (a[i] - rem < num && a[i] + rem > num) {
				System.out.println("Array Elememnt is " + a[i]);
			}
		}

	}

}
