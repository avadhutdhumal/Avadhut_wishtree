package Mock;

import java.util.Comparator;

public class Suppliername implements Comparator<Supplier>{

	@Override
	public int compare(Supplier s, Supplier ss) {
		return s.name.compareTo(ss.name);
	
	}

}
