package string_methods;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb.hashCode());
		sb.append("java");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		

	}

}
