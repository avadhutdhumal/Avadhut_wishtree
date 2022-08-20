/*307 311 313 317 331 337 347 349 353 359 367 373 379 383 389 397*/
package assignment_6aug;

public class Prime_Number_300_400 {

	public static void main(String[] args) {
		int a = 400;
		int b = 300;

		while (a > b) {
			int flag = 0;
			for (int j = 2; j <= b / 2; j++) {
				if (a % j == 0) {
					flag = 1;
					break;
				}
			}

			if (flag == 0)
				System.out.print(a + " ");
			a--;
		}
	}
}