package practice_programs;

public class Immutable_Str{
	public static void main(String[] args) {
		
		String s="Avadhut";
		System.out.println(s.hashCode());
		s=s.concat("Dhumal");
		System.out.println(s);
		System.out.println(s.hashCode());
		String s1="Avadhut";
		System.out.println(s1.hashCode());		
		}

}
