package collection_comparator;

public class Profile implements Comparable<Profile> {

	String State;
	String city;
	
	public Profile(String state, String city) {
		super();
		State = state;
		this.city = city;
	}

	@Override
	public int compareTo(Profile o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
