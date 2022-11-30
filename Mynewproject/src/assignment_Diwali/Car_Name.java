package assignment_Diwali;

import java.util.Comparator;

public class Car_Name implements Comparator<Car> {

	@Override
	public int compare(Car co, Car cco) {
		
		return co.c_name.compareTo(cco.c_name);
	}
	

}
