package assignment_Diwali;

public class Customer implements Comparable<Customer> {
	int c_id;
	String c_name;
	String d_of_account;

	public Customer(int c_id, String c_name, String d_of_account) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.d_of_account = d_of_account;
	}

	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", d_of_account=" + d_of_account + "]";
	}

	@Override
	public int compareTo(Customer o) {
		if (this.c_id < o.c_id)
			return -1;
		else if (this.c_id > o.c_id)
			return 1;
		else
			return 0;

	}

}
