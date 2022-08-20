package assignment_13aug;
import java.util.Scanner;
public class LaptopMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No Of USB Port");
		int noOfUSBPort=sc.nextInt();
		System.out.println("Enter Processor Speed");
		int processorSpeed=sc.nextInt();
		
		Laptop l= new Laptop();
		l.setNoOfUSBPort(noOfUSBPort);
		l.setProcessorSpeed(processorSpeed);
		
		System.out.println("No Of USB Port: "+l.getNoOfUSBPort() + " ports");
		System.out.println("Processor Speed: "+l.getProcessorSpeed() + " Ghz");

	}
}
