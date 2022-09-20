package exceptiion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionPropagation {

	public void task1() 
	{
		task2();
	}
	public void task2() 
	{
		task3();
	}
	public void task3() 
	{
		FileInputStream fin=null;
		int ch;
		try {
			fin = new FileInputStream("D:\\Kirti\\File1.txt");
			ch = fin.read();		
			while(ch != -1)
			{
					System.out.print((char)ch);
					ch=fin.read();
			}
		} 
		catch (FileNotFoundException  e)
		{
			e.printStackTrace();
		}	
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		

	public static void main(String[] args)
	{
		CheckedExceptionPropagation o = new CheckedExceptionPropagation();
		
			o.task1();
		

	}

}
