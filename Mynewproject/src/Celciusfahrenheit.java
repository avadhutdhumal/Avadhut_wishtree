import java.util.Scanner;

public class Celciusfahrenheit {

	public static void main(String[] args) {

		float celcius, fahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperture in celcius: ");
		celcius = sc.nextFloat();
		fahrenheit = celcius * 9 / 5 + 32;

		System.out.println("Temperture in Fahrenheit: " + fahrenheit);
		sc.close();
	}

}
