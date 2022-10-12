package collection_comparator;

import java.util.Comparator;

public class Moviename implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.m_name.compareTo(o2.m_name);
	}
	

}
