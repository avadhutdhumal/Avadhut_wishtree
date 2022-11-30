package assignment_15Oct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class StudentMain {

	public static void main(String[] args) {

		Test t1 = new Test("Assessment", "10/10/2022");
		Test t2 = new Test("Semister  ", "15/10/2022");
		Test t3 = new Test("Final     ", "20/09/2022");

		ArrayList<Test> at = new ArrayList<Test>();
		at.add(t1);
		at.add(t2);
		at.add(t3);

		Student s1 = new Student(101, "Pooja", at);
		Student s2 = new Student(102, "Dhanajay", at);
		Student s3 = new Student(103, "Rohan", at);

		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);

		Set<Entry<Integer, Student>> ent = hm.entrySet();
		Iterator<Entry<Integer, Student>> it = ent.iterator();
		System.out.println("============Original MaP============");
		while (it.hasNext()) {
			Entry<Integer, Student> ss = it.next();
			System.out.println("\n" + ss);
//			System.out.println(ss.s_id+"   "+ss.s_name);
//			System.out.println(" ");
			Iterator<Test> it1 = ss.getValue().t.iterator();

			while (it1.hasNext()) {
				Test t = (Test) it1.next();
				System.out.println(t);
			}

		}
		System.out.println("\n============Copied MaP==============");
		HashMap<Integer, Student> hss = new HashMap<Integer, Student>(hm);
		Set<Entry<Integer, Student>> ent1 = hss.entrySet();
		Iterator<Entry<Integer, Student>> it1 = ent1.iterator();

		while (it1.hasNext()) {
			Entry<Integer, Student> ss1 = it1.next();
			System.out.println("\n" + ss1);
//			System.out.println(ss.s_id+"   "+ss.s_name);
//			System.out.println(" ");
			Iterator<Test> it2 = ss1.getValue().t.iterator();

			while (it2.hasNext()) {
				Test tt = (Test) it2.next();
				System.out.println(tt);
			}

		}

		System.out.println("\n============MAP PORTION KEY LESS THAN 2==============");
		Set<Entry<Integer, Student>> ent2 = hss.entrySet();
		Iterator<Entry<Integer, Student>> it2 = ent2.iterator();

		while (it2.hasNext()) {
			Entry<Integer, Student> ss1 = it2.next();
			if (ss1.getKey() < 2) {
				System.out.println("\n" + ss1);
				Iterator<Test> it3 = ss1.getValue().t.iterator();

				while (it3.hasNext()) {
					Test tt = (Test) it3.next();
					System.out.println(tt);
				}
			}
		}
		
		System.out.println("\n============MAP PORTION KEY LESS THAN OR EQUAL 2 ==============");
		Set<Entry<Integer, Student>> ent3 = hss.entrySet();
		Iterator<Entry<Integer, Student>> it4 = ent3.iterator();

		while (it4.hasNext()) {
			Entry<Integer, Student> ss1 = it4.next();
			if (ss1.getKey() <= 2) {
				System.out.println("\n" + ss1);
//			System.out.println(ss.s_id+"   "+ss.s_name);
//			System.out.println(" ");
				Iterator<Test> it5 = ss1.getValue().t.iterator();

				while (it5.hasNext()) {
					Test tt = (Test) it5.next();
					System.out.println(tt);
				}
			}
		}
	
		System.out.println("\n============MAP PORTION KEY GREATER THAN 2 ==============");
		Set<Entry<Integer, Student>> ent4 = hss.entrySet();
		Iterator<Entry<Integer, Student>> it6 = ent4.iterator();

		while (it6.hasNext()) {
			Entry<Integer, Student> ss1 = it6.next();
			if (ss1.getKey() > 2) {
				System.out.println("\n" + ss1);
				Iterator<Test> it7 = ss1.getValue().t.iterator();

				while (it7.hasNext()) {
					Test tt = (Test) it7.next();
					System.out.println(tt);
				}
			}
		}
		
		System.out.println("\n============MAP PORTION KEY GREATER THAN 3 ==============");
		Set<Entry<Integer, Student>> ent5 = hss.entrySet();
		Iterator<Entry<Integer, Student>> it8 = ent5.iterator();

		while (it8.hasNext()) {
			Entry<Integer, Student> ss1 = it8.next();
			if (ss1.getKey() > 3) {
				System.out.println("\n" + ss1);
				Iterator<Test> it9 = ss1.getValue().t.iterator();

				while (it9.hasNext()) {
					Test tt = (Test) it9.next();
					System.out.println(tt);
				}
			}
		}
		
	}
}
