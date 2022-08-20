package inheritance;
import java.util.Scanner;
public class TvMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter TV Brand: ");
		String tvbrand=sc.next();
		
		System.out.println("Enter TV Price: ");
		int tvprice=sc.nextInt();
		
		System.out.println("Enter TV Color: ");
		String color=sc.next();
		
		System.out.println("Enter Home Theater Brand: ");
		String hbrand=sc.next();
		
		System.out.println("Enter Home Theater Price: ");
		int hprice=sc.nextInt();
		
		System.out.println("Enter Home Theater Color: ");
		String hcolor=sc.next();
		
		Tv t=new Tv();
		t.setTvbrand(tvbrand);
		t.setTvprice(tvprice);
		t.setColor(color);
		
		Home_Theater h=new Home_Theater();
		t.setHome_Theater(h);
		t.getHome_Theater().setHbrand(hbrand);
		t.getHome_Theater().setHprice(hprice);
		t.getHome_Theater().setHColor(hcolor);
		
		System.out.println("TV Brand: "+t.getTvbrand());
		System.out.println("TV Price: "+t.getTvprice());
		System.out.println("TV Color: "+t.getColor());
		System.out.println("Home Theater Brand: "+t.getHome_Theater().getHbrand());
		System.out.println("Enter Home Theater Price: "+t.getHome_Theater().getHprice());
		System.out.println("Enter Home Theater Color: "+t.getHome_Theater().getHColor());
		
	}

}
