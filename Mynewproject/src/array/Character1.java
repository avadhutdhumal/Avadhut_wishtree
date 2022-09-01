package array;

public class Character1 {

	public static void main(String[] args) {
		char arr[]= {'a','b','a','z','b','c'};
		int i,j;
		
		for( i=0;i<arr.length;i++)
		{
			int count=0;
			for( j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] )
				{
					count++;  //1 2 0 3 2 0 4 2 0 0 2 2
					arr[j]='\0';
				}
			}
			
			if(arr[i]!='\0')
			{
				System.out.println(arr[i]+"--->"+count);
			}
			}

	}

}
