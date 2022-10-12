package collection_comparator;

public class Employee_ implements Comparable<Employee_> {

	int e_id;
	String e_name;
	String designation;
	int age;
	Profile p;

	public Employee_(int e_id, String e_name, String designation, int age, Profile p) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.designation = designation;
		this.age = age;
		this.p = p;
	}

	@Override
	public int compareTo(Employee_ o) {
		if (this.age > o.age)
			return 1;
		else if (this.age < o.age)
			return -1;
		else
			return 0;
	}
}
