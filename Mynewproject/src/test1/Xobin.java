package test1;
import java.util.*;
public class Xobin {
	static int high2;
	public static int secondHighest(ArrayList<Integer> al)
	{
		Collections.sort(al);
		Collections.reverse(al);
		high2=al.get(1);
		return high2;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<Integer> ();
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			al.add(sc.nextInt());
		}
		
		secondHighest(al);
		int sum=0;
		for (int i = 0; i < al.size(); i++) {
			int num=al.get(i);
			if(num<high2)
			{
				sum=sum+num;
			}
		}
		System.out.println(sum);
	}

}
