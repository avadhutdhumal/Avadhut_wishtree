package Written_Test2;

import java.util.*;

public class Ques22 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(14);
		ts.add(15);
		ts.add(63);
		ts.add(78);
		ts.add(96);
		ts.add(100);
		ts.add(112);

		Scanner sc = new Scanner(System.in);
		Iterator<Integer> it = ts.iterator();
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		while (it.hasNext()) {
			if (it.next() == num) {
				it.next();
				if (it.next() == null) {
					System.exit(0);
				}

				else {
					System.out.println(it.next());
				}
			}

		}

	}

}
