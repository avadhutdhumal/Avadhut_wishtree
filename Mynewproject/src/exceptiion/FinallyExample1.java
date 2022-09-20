package exceptiion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyExample1 {

	FileInputStream fin;
	public void readFile() 
	{
		try 
		{
		fin = new FileInputStream("D:\\NPKey2.txt");
		int ch = fin.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch = fin.read();
		}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			
			System.out.println("FileInputStream Closed");
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public void doReading()  throws IOException
	{
		readFile();
	}
	public static void main(String[] args) throws IOException
	{
			new FinallyExample1().doReading();
		
		

	}

}
