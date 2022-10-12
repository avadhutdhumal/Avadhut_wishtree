package collection_comparator;

import java.util.*;


public class EmpMain {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Komal",12000);
		Employee e2=new Employee(2,"Priya",10000);
		Employee e3=new Employee(3,"Sonal",8000);
		Employee e4=new Employee(4,"Zen",13000);
		Employee e5=new Employee(4,"Kinjal",12000);
		
		ArrayList<Employee> arr=new ArrayList();
		arr.add(e1);
		arr.add(e2);
		arr.add(e3);
		arr.add(e4);
		arr.add(e5);
		
		Iterator<Employee>it=arr.iterator();
		
	/*	for(int i=0;i<arr.size();i++)
		{
			Employee e=arr.get(i);
			System.out.println(e.e_id+" "+e.name+" "+e.salary);
		}*/
		
		while(it.hasNext())
		{
			Employee e=it.next();
			String s=e.name;
			
			if(s.equals("sonal"))
			{
				it.remove();
				
			}
			
			
		}
		
		for(Employee e:arr)
		{
		System.out.println(e.e_id+" "+e.name+" "+e.salary);
		}
		
//		Collections.sort(arr);
		
		System.out.println("---------");
		
		for(Employee emm:arr)
		{
		System.out.println(emm.e_id+" "+emm.name+" "+emm.salary);
		}

	}

	

}
