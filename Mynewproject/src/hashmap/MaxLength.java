package hashmap;

public class MaxLength {

	public static void main(String[] args) {
		String s="This is an Umbrella Umbrella beautiful";
		int a[]=new int[5];
		String word[]=new String[5];
		
		int k=0;
		String arr[]=s.split(" ");
		int max=arr[0].length(),i;
		String temp="";
		for( i=1;i<arr.length;i++)
		{
			
			if(arr[i].length()>=max)
			{
				
				max=arr[i].length();
				a[k]=max;
				//temp=arr[i];
				word[k]=arr[i];
				k++;
			}
			
		}
		for(i=0;i<k;i++) {
			System.out.println(word[i]+"-----"+a[i]);
		}

	}

}
