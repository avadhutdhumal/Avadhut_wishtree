package practice_array;

import java.util.Scanner;

public class TheatreMain {

	public static void main(String[] args) {
		Movie m=new Movie();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie id");
		int m_id=sc.nextInt();
		System.out.println("Enter movie_name");
		@SuppressWarnings("unused")
		String name=sc.next();
		System.out.println("Enter rating");
		float rating=sc.nextFloat();
		
		Theatre t=new Theatre();
		System.out.println("Enetr theatre id");
		int t_id=sc.nextInt();
		System.out.println("Enetr theatre name");
		String t_name=sc.next();
		System.out.println("Enetr theatre location");
		String t_location=sc.next();
		t.setT_id(t_id);
		t.setT_name(t_name);
		t.setLocation(t_location);
		t.setM(m);//location
		t.getM().setM_id(m_id);
		t.getM().setM_name(t_name);
		t.getM().setRating(rating);
		
		System.out.println(t.getT_id());
		System.out.println(t.getT_name());
		System.out.println(t.getLocation());
		System.out.println(t.getM().getM_id());
		System.out.println(t.getM().getM_name());
		System.out.println(t.getM().getRating());
		

	}

}
