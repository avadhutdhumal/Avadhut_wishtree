package practice_array;

import java.util.Arrays;

public class Theatre1 {
	int t_id;
	String t_name;
	String location;

	Movie1 m[];

	public Theatre1(int t_id, String t_name, String location, Movie1[] m) {

		this.t_id = t_id;
		this.t_name = t_name;
		this.location = location;
		this.m = m;
	}

	@Override
	public String toString() {
		return "Theatre1 [t_id=" + t_id + ", t_name=" + t_name + ", location=" + location + ", m=" + Arrays.toString(m)
				+ "]";
	}

}
