package practice_array;

public class Movie1 {
	
	int m_id;
	String m_name;
	float rating;
	public Movie1(int m_id, String m_name, float rating) {
		
		this.m_id = m_id;
		this.m_name = m_name;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie1 [m_id=" + m_id + ", m_name=" + m_name + ", rating=" + rating + "]";
	}
	
	
	

}
