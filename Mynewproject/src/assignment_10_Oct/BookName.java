package assignment_10_Oct;

import java.util.Comparator;

public class BookName implements Comparator<Book1>{

	@Override
	public int compare(Book1 o1, Book1 o2) {
		return o1.name.compareTo(o2.name);
	}

}
