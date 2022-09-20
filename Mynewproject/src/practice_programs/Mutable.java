package practice_programs;

public class Mutable {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Avadhut");
		System.out.println(s);
		System.out.println(s.hashCode());
		String str="Dhumal";
		s=s.append(str);
		System.out.println(s);
		System.out.println(s.hashCode());
	}	
}