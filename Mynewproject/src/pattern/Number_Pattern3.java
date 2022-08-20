package pattern;
public class Number_Pattern3 {

	public static void main(String[] args) {
		int i,j,l;
		int k=1;
		
		for(i=1;i<=5;i++)
		{
			for(int sp=4;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			l=i;
			
			for(j=1;j<=k;j++)
			{
				if(j>=i+1)
				{
					System.out.print(--l);
				}
				else
				{
					System.out.print(j);
				}
			}
			k=k+2;
			System.out.println(" ");
		}	
	  }
	}
