package assignment_10_Oct;

import java.util.ArrayList;
import java.util.Iterator;

public class Employi_Main {

	public static void main(String[] args) {
		Dipartment d1=new Dipartment(101, "Development");
		Dipartment d2=new Dipartment(102, "Testing");
		
		Employi e1=new Employi(41565, "Vinit", 35000, d1);
		Employi e2=new Employi(62354, "Nitin", 40000, d1);
		Employi e3=new Employi(12458, "Kamal", 65000, d1);
		Employi e4=new Employi(74512, "Vijay", 24000, d2);
		Employi e5=new Employi(36521, "Bhism", 28000, d2);
		Employi e6=new Employi(32256, "Kiran", 55000, d2);
		
		ArrayList<Employi> al=new ArrayList<Employi>();
		
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		
		System.out.println("Displaying Employee Information");
		System.out.println("--------------******-------------");
		Iterator<Employi> it=al.iterator();
		while(it.hasNext())
		{
			Employi e=it.next();
			System.out.println(e.e_id+"  "+e.name+"  "+e.sal+"  "+e.d.d_id+"   "+e.d.d_name);
		}
	}

}
