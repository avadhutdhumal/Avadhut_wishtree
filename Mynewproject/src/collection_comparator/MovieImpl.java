package collection_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MovieImpl {

	public static void main(String[] args) {
		Movie m1=new Movie(1,"XXX",5.6f);
		Movie m2=new Movie(2,"YYY",7.0f);
		Movie m3=new Movie(3,"PPP",8.0f);
		Movie m4=new Movie(1,"AAA",8.7f);
		
		ArrayList<Movie> al=new ArrayList();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		
//		Collections.sort(al, new Rating());
//		System.out.println("Sorting done on basis of rating");
//		for(Movie m:al)
//		{
//			System.out.println(m.m_id+" "+m.m_name+" "+m.rating);
//		}
		
		Collections.sort(al, new Moviename());
		System.out.println("Sorting done on basis of movie name");
		for(Movie m:al)
		{
			System.out.println(m.m_id+" "+m.m_name+" "+m.rating);
		}

	}

}
