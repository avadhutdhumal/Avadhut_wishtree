import java.util.Scanner;

public class Employeesalary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float basic, da, hra;
		System.out.println("Enter the basic salary of Employee:");
		basic = sc.nextFloat();

		da = (basic * 35 / 100);
		hra = (basic * 25 / 100);
		float salary = da + hra + basic;

		System.out.println("The Salary of Employee:" + salary);

		if (salary >= 100000) {
			System.out.println("Designation: Vice President");
		}

		else if (salary >= 80000 && salary < 100000) {
			System.out.println("Designation: Asst. Vice President");
		}

		else if (salary >= 60000 && salary < 80000) {
			System.out.println("Designation: Manager");
		}

		else if (salary >= 40000 && salary < 60000) {
			System.out.println("Designation: Executive");
		}

		else {
			System.out.println("Designation: Officer");
		}
		sc.close();
	}

}
