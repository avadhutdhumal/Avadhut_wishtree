package written_Test1;

import java.util.*;

public class Ques2 {
	Scanner sc = new Scanner(System.in);
	void check(ArrayList<String> al) {
		Iterator<String> it = al.iterator();
		System.out.println("Enter Charater: ");
		String  c=sc.next();
		while (it.hasNext()) {
			String s = it.next();
			String[] k = s.split("\\+");
			for (int i = 0; i < k.length; i++) {
				if (k[0].equalsIgnoreCase(c)) {
					System.out.println("Integer Value: "+k[1]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		
		Ques2 q=new Ques2();
		q.check(al);
		

	}
}