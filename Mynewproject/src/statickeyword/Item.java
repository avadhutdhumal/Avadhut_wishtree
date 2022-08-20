package statickeyword;
import java.util.Scanner;

	public class Item {
		
		int item_id;//declare
		String name;
		int price;
		
		void accept(int id,String n,int p)
		{
			item_id=id;
			name=n;
			price=p;
	}
		
	/*void accept()
	 * {
	 * 	Scanner sc=new Scanner(System.in);
		System.out.println("Enter item_id");
		int item_id=sc.nextInt();
		System.out.println("Enter item_name");
		String name=sc.next();
		System.out.println("Enter item_price");
		int price=sc.nextInt();
		}
	 */
		
		void display(int item_id,String name,int price)
		{
			System.out.println("Item id is...."+item_id);
			System.out.println("Item name is...."+name);
			System.out.println("Item price is...."+price);
		}
		
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter item_id");
				int item_id=sc.nextInt();
				System.out.println("Enter item_name");
				String name=sc.next();
				System.out.println("Enter item_price");
				int price=sc.nextInt();
				sc.close();
			Item i=new Item();
		//	i.accept(item_id,name,price);//parameters
			i.display(item_id,name,price);
	
	}

}
