package hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortingOfUser {

	public static void main(String[] args) {
		HashMap<Student,Course> hs=new HashMap<Student,Course>(); 
		//LinkedHashMap<Student,Course> hs=new LinkedHashMap<Student,Course>(); 
		
		
		Student s1=new Student(1,"ram");
		Student s2=new Student(2,"kinjal");
		Student s3=new Student(3,"priya");
		
		Course c1=new Course(1,"software",20000);
		Course c2=new Course(2,"hardware",10000);
		Course c3=new Course(3,"designing",15000);
		
		hs.put(s1, c1);
		hs.put(s2, c2);
		hs.put(s3, c3);
		
		/*TreeMap<Student,Course> ts=new TreeMap<Student,Course>(new SortingStu() );
		ts.putAll(hs);
		Set<Entry<Student,Course>>   entry= ts.entrySet();
		for(Map.Entry<Student,Course> map:entry)
		{
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}*/
		
		TreeMap<Student,Course> ts=new TreeMap<Student,Course>( new Comparator<Student>()
				{

					@Override
					public int compare(Student o1, Student o2) {
						return o1.s_name.compareTo(o2.s_name);
					}
			
				});
		ts.putAll(hs);
		Set<Entry<Student,Course>>   entry= ts.entrySet();
		for(Map.Entry<Student,Course> map:entry)
		{
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
				
		

	}

}
