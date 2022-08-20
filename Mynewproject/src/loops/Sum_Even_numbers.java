package loops;

public class Sum_Even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i;
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}		
			
		}
	
		System.out.println("The sum of even number is: " +sum);
	}
}
