package collection_comparator;

import java.util.Comparator;

public class CityComp implements Comparator<Profile> {

	public int compare(Profile o1, Profile o2) {
		return o1.city.compareTo(o2.city);
	}

	
	}

	

