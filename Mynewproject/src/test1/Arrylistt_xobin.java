package test1;
import java.util.*;
public class Arrylistt_xobin {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
//		al.add(6);
//		al.add(5);
//		al.add(4);
//		al.add(2);
//		al.add(7);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		for (int i = 0; i<=4; i++) {
			al.add(sc.nextInt());
		}
	
		int sec=al.get(0);
		int lar=al.get(0);
		int sum=0;
		for (int i = 0; i < al.size(); i++) {
			if(al.get(i)>lar)
			{
				sec =lar;
				lar=al.get(i);
				
				if(al.get(i) > sec && al.get(i)!=lar)
				{
					sec=al.get(i);
				}
			}
			if(al.get(i)<sec)
			{
				sum=sum+al.get(i);
			}
		}
//		System.out.println(sec); 
		System.out.println("Sum is: "+sum);
	}

}
