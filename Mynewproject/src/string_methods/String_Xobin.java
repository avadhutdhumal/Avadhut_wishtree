package string_methods;

public class String_Xobin {
	public static void main(String[] args) {
		String s= "Good bye bye world world";
		String words[]=	s.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j]))
				{
					System.out.print(words[i]+" ");
				}
			}
		}
	}
}