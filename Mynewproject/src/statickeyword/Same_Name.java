package statickeyword;
public class Same_Name {
	int num;
	char name;

	void print(int num,char name)
	{
		System.out.println("Integer : " +num+  "   " +"Character: "+name);
	}
	
	void print(char name,int num)
	{
		System.out.println("Charater: " +num+ "    "+ "Integer: "+name);
	}
	
	public static void main(String[] args) {
	
		Same_Name sn= new Same_Name();
		sn.print(1,'A');
		sn.print('B',2);
		
		
		
		
		
	}

}
