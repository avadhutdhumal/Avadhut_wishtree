package string_methods;

public class Employee {

	public static void main(String[] args) {
		String s="Java";
		String s1=new String("Java");
//		s1=s.compareTo(2);
		int a=s.compareTo(s1);
		System.out.println(s1==s);
		System.out.println(s.compareTo(s1));
		System.out.println(s1.intern());
		
		String k="AVADHUT";
		System.out.println(k.contains("IN")); 
		System.out.println(k.substring(0));
		System.out.println(k.concat(" DHUMAL"));
	}

}
