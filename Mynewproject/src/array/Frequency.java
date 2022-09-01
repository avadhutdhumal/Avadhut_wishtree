package array;

public class Frequency {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,-1,3,5,-1};
		boolean visited;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			 visited=false;
			 for(int j=i-1;j>=0;j--)
			 {
				 if(arr[i]==arr[j])
				 {
					 visited=true;
					 break;
				 }
			 }
			 if(visited==false ) 
			 {
				 for(int k=i+1;k<arr.length;k++)
				 {
					 if(arr[i]==arr[k])
					 {
						 count++;
					 }
				 
			 }
			 
			 if(count==1)
				 
				 System.out.println(arr[i]+"----->"+count);
		}

	}
	}
}



