package collection_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Employee_MAin {

	public static void main(String[] args) {
		Profile p1=new Profile("Maharastra", "Pune");
		Profile p3=new Profile("Karnataka", " Banglore");
		Profile p2=new Profile("Himachal", "  Kangra");
		Employee_ e1= new Employee_(11547, "Mr.Sham","   A.Manger", 52,p1);
		Employee_ e2= new Employee_(86547, "Mr.Ajay","   S.Manger", 45,p3);
		Employee_ e3= new Employee_(65897, "Ms.Sonu", "    Officer", 23,p2);
		Employee_ e4= new Employee_(14256, "Mr.Ramu", "  Executive", 31,p1);
		Employee_ e5= new Employee_(23547, "Mr.Amit", "A.Executive", 29,p3);
		Employee_ e6= new Employee_(78998, "Mr.Bush", "  President", 48,p2);
		Employee_ e7= new Employee_(33654, "Ms.Neha", "V.President", 37,p1);
		Employee_ e8= new Employee_(95452, "Mr.John", "  G.Manager", 28,p1);
		
		ArrayList <Employee_> al=new ArrayList<Employee_>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);
		al.add(e8);

		Iterator<Employee_> it=al.iterator();
		
		System.out.println("\n\n-------Dispalying Employee Information---------");
		while(it.hasNext())
		{
			Employee_ ee=it.next();
			System.out.println(ee.e_id+"  "+ee.e_name +"   "+ee.age+"     "+ee.designation+ "    "+ee.p.State+"   " +ee.p.city);
		}
		
		System.out.println("\n\n-------Sorting On Basis OF Age---------");
		System.out.println();
		
		
		Collections.sort(al);
		for(Employee_ i:al)
		{
			System.out.println(+i.e_id+"  "+i.e_name +"   "+i.age+"     "+i.designation+ "    "+i.p.State+"   " +i.p.city);
		}
		
		
		
		
	}

	
}
