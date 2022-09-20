package string_methods;

public class Split1 {

	public static void main(String[] args) {
		int count=0;
		//regular expression includes,' ',@
		String s="java,programming,langugage,object,oriented,language";
		/*char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
			
		}
		System.out.println(count+1);*/
		
		String str[]=s.split(",");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
			count++;
		}
		System.out.println(count);
		
		
	}

}
