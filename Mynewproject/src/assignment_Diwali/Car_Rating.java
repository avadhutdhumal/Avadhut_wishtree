package assignment_Diwali;

import java.util.Comparator;

public class Car_Rating implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		if (c1.rating < c2.rating)
			return 1;
		else if (c2.rating > c2.rating)
			return -1;
		else
			return 0;
	}

}
