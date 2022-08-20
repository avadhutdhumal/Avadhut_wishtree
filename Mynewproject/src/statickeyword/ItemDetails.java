package statickeyword;
public class ItemDetails {
	
		 int item_id,item_price;
		 String item_name;
		 static String sup_name="xyz";
		 
		 public ItemDetails(int item_id,int item_price,String item_name)
		 {
			 this.item_id=item_id;
			 this.item_name=item_name;
			 this.item_price=item_price;
		 }
		 static String display()
		 {
			
			 return sup_name;
		 }
		 void show()
		 {
			 System.out.println("item_id:"+item_id);
			 System.out.println("item_name:"+item_name);
			 System.out.println("item_price:"+item_price);
		 }
	
		public static void main(String[] args)
		{
			ItemDetails.sup_name="xyz";
			//System.out.println(ItemDetails.sup_name);
			
			ItemDetails td=new ItemDetails(1,20,"pizza");
			System.out.println(display());
			td.show();
			

	}

}
