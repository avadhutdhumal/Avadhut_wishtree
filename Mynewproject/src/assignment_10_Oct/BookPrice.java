package assignment_10_Oct;

import java.util.Comparator;

public class BookPrice implements Comparator<Book1> {

	@Override
	public int compare(Book1 o1, Book1 o2) {
		if (o1.price > o2.price)
			return 1;
		else if (o1.price < o2.price)
			return -1;
		else
			return 0;

	}

}
