package collection_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerArrayList {

	List<Customer> display()
	{
		Customer c1=new Customer(1,"XXX","4543");
		Customer c2=new Customer(2,"YYY","565656");
		Customer c3=new Customer(3,"AAA","23423434");
		Customer c4=new Customer(4,"ZZZ","87867867");
		Customer c5=new Customer(5,"BBB","7876878");
		
		ArrayList<Customer> al=new ArrayList<>();
		//ArrayList<Book> al=new ArrayList<>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		return al;
		
		
		
	

}
}
