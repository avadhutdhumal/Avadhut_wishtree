package exceptiion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ARMExample {

	//FileInputStream fin = null;
	public void readFile() //throws IOException
	{
		try(FileInputStream fin = new FileInputStream("D:\\NPKey.txt");
				)
		{
		
		int ch = fin.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch = fin.read();
		}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public void doReading()  throws IOException
	{
		readFile();
	}
	public static void main(String[] args) throws IOException
	{
			new ARMExample().doReading();
		
		

	}

}

