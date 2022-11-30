package Mock;

public class Supplier implements Comparable<Supplier> {
	int s_id;
	String name;
	Item i;
	public Supplier(int s_id, String name, Item i) {
		super();
		this.s_id = s_id;
		this.name = name;
		this.i = i;
	}
	
	@Override
	public int compareTo(Supplier o) {
		this.name.compareTo(o.name);
		return 1;
	}

}
