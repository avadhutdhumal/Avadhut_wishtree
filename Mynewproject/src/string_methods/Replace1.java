package string_methods;
// char ch[]={a,b,c,z};
//c,d,e,b
public class Replace1 {

	public static void main(String[] args) {
		String s="abc@gmail.com,abc@hotmail.com";
		System.out.println(s.replace('l', 'v'));
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='l')
			{
				ch[i]='v';
			}
			System.out.print(ch[i]);
		}
		
	System.out.print(	s.replace("mming", "abcd"));
	System.out.print(s.replaceAll("@", "@@"));
	System.out.print(s.replaceFirst("@", "@@"));

	}

}
