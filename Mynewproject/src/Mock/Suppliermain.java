package Mock;

import java.util.Iterator;
import java.util.TreeSet;

public class Suppliermain {

	public static void main(String[] args) {
		
		Item i1=new Item("Washing_Machine",15000);
		Item i2=new Item("Cooker", 500);
		Item i3=new Item("Smartphone", 150000);
		Item i4=new Item("Speaker", 500);
		
		Supplier s1=new Supplier(101,"Rahul", i1);
		Supplier s2=new Supplier(102,"Yogesh",i3);
		Supplier s3= new Supplier(103,"Suraj",i4);
		Supplier s4=new Supplier(104,"Harish",i2);
		
		TreeSet<Supplier> ts=new TreeSet<Supplier>(new Suppliername());
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		Iterator<Supplier> it =ts.iterator();
		for(;it.hasNext();)
		{
			Supplier s=it.next();
			System.out.println(s.s_id+"     "+s.name+"     "+s.i.item_name+"     "+s.i.price);
		}

		
	}

}
