package loops;
import java.util.Scanner;
public class Milk_Oil_Price {

	public static void main(String[] args) {
		int total=0,totalmilkqty=0,totaloilqty=0;
	
		do
		{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Quantity of Milk:");
			int  milkqty=sc.nextInt();	
			int milkprice=40*milkqty;
			
			System.out.println("Enter Quantity of Oil:");
			int oilqty=sc.nextInt();
			int oilprice=50*oilqty;
			
			total=total+milkprice+oilprice;
			totalmilkqty=totalmilkqty+milkqty;	
			totaloilqty=totaloilqty+oilqty;
			
		if(total>=500)
		{
			System.out.println("You have exceeded limit");
			break;
		}
	
		}
		while (true);
		System.out.println("Your total amount is : " +total);
		System.out.println("You have got milk : " +totalmilkqty);
		System.out.println("You have got milk : " +totaloilqty);
	}
}
