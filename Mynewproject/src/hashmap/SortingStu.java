package hashmap;

import java.util.Comparator;

public class SortingStu implements Comparator<Student> {

	
	@Override
	public int compare(Student o1, Student o2) {
		return o1.s_name.compareTo(o2.s_name);
	}
	

}
