package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student_course {

	public static void main(String[] args) {
		//HashMap<Student,Course> hs=new HashMap<Student,Course>(); 
		LinkedHashMap<Student,Course> hs=new LinkedHashMap<Student,Course>(); 
		
		
		Student s1=new Student(1,"ram");
		Student s2=new Student(2,"kinjal");
		Student s3=new Student(3,"priya");
		
		Course c1=new Course(1,"software",20000);
		Course c2=new Course(2,"hardware",10000);
		Course c3=new Course(3,"designing",15000);
		
		hs.put(s1, c1);
		hs.put(s2, c2);
		hs.put(s3, c3);
		//hs.put(s3, c2);
		
	//	System.out.println(hs);
		
		Set<Entry<Student,Course>> set=  hs.entrySet();
		
		for(Map.Entry<Student, Course> map:set)
		{
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
		//to display students whose taken course above 15000
	/*	for(Map.Entry<Student, Course> map:set)
		{
			
			Course c=map.getValue();
			if(c.price>15000)
			{
				System.out.println(map.getKey());
			}
		}
		
		System.out.println("------");
  		
		   ////to display course details of student priya
		for(Map.Entry<Student, Course> map:set)
		{
			Student s=map.getKey();
			if(s.s_name.equals("ram"))
			{
				//Course c=map.getValue();
				System.out.println(map.getValue().c_name);
			}
		}*/
		    
		

	}

}
