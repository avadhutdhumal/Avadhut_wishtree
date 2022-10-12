package collection_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		
		
		CustomerArrayList ct=new CustomerArrayList();
		List<Customer> li=	ct.display();
		Iterator<Customer> it=	li.iterator();
		
		while(it.hasNext())
		{
			Customer c=it.next();
			if(c.c_name.equals("AAA"))
			{
			System.out.println(c.c_id +" "+c.c_name+ " "+c.mob_no);
			}
		}
		}
	}


