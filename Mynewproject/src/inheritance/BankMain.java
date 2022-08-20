package inheritance;
import java.util.Scanner;
public class BankMain {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bank Name: ");
		String bankname=sc.next();
		
		System.out.println("Enter Bank Address: ");
		String bankaddress=sc.next();
		
		System.out.println("Enter Bank Number: ");
		int banknumber=sc.nextInt();
		
		System.out.println("Enter Employee ID: ");
		int employeeId=sc.nextInt();
		
		System.out.println("Enter Employee Name: ");
		String ename=sc.next();
		
		System.out.println("Enter Employee Salary: ");
		int esalary=sc.nextInt();
		
		Bank b= new Bank();
		b.setbankname(bankname);
		b.setbankaddress(bankaddress);
		b.setbanknumber(banknumber);
		
		Employee e= new Employee();
		b.setEmployee(e);
		b.getEmployee().setemployeeId(employeeId);
		b.getEmployee().setename(ename);
		b.getEmployee().setesalary(esalary);
		
		
		
		System.out.println("Bank Name: "+b.getbankname());
		System.out.println("Bank Address: "+b.getbankaddress());
		System.out.println("Bank Number: "+b.getbanknumber());
		
		System.out.println("Employee ID: "+ b.getEmployee().getemployeeId());
		System.out.println("Employee Name: "+b.getEmployee().getename());
		System.out.println("Employee Salary: "+b.getEmployee().getesalary());
		
	}

}
