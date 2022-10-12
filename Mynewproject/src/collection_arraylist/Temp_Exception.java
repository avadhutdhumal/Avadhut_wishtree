package collection_arraylist;

import java.util.Scanner;

@SuppressWarnings("serial")
public class Temp_Exception extends Exception
{
	int temp;
//		int fah;
	int i;
	 int arr[] = new int[5];

	void temp() throws Temp_Exception
	{
		for (int i = 0; i < 5; i++) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Temperature(CELCIUS): ");
		temp = sc.nextInt();
		int fah = ((temp * 9 / 5) + 32);
		System.out.println("Temperture (FARENHEIT): " + fah);
		// sc.close();
		
		arr[i] = fah;
		
		try {
		if(fah>100) 
			throw new Temp_Exception();
		}
		
		catch (Temp_Exception e) {
			System.out.println("\n*******CAUTION*********");
			System.out.println("TEMPERATURE RAISED ABOVE 100 FARENHEIT");
		
		}
		}
		}
		
	void show() {
		System.out.println("\nOVERALL TEMPERATURE IN FARENHEIT");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	public static void main(String[] args) throws Temp_Exception {
		Temp_Exception t = new Temp_Exception();
		 {
//			for (int i = 0; i < 5; i++) {
//				try {
					t.temp();
//				} catch (Temp_Exception e) {
//					System.out.println("Caution: Temperture Has  Raised Above 100");
//				}
//			}
		} 
		t.show();

	}

}
