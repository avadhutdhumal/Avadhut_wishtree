package exceptiion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeIO {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("E://Vaio/dataa.txt");
		}
		catch (FileNotFoundException e) {
			System.out.println("File is not there in ur system");
		}

		System.out.println("rest of the code");

	}

}
