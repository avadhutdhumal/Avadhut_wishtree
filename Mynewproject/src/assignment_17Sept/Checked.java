package assignment_17Sept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=null;
		int ch;
			try {
				fin = new FileInputStream("D:\\Avadhut\\File.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ch = fin.read();		
			while(ch != -1)
			{
					System.out.print((char)ch);
					ch=fin.read();
			}

	}

}
