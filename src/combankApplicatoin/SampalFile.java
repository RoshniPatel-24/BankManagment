package combankApplicatoin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class SampalFile {
	public static void main(String[] args) {
		
		File obj = new File("E:\\Roshni.txt");
		FileOutputStream objFileOutputStream=null;
		FileInputStream objFileInputStream=null;
		int ch;
		byte cities[]= {'a','m','d','m','u','m'};
		try {
			
			objFileOutputStream = new FileOutputStream(obj);
			objFileOutputStream.write(cities);
			objFileOutputStream.close();
			
			objFileInputStream = new FileInputStream(obj);
			while((ch=objFileInputStream.read())!=-1) {
				System.out.print((char)ch);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
				try {
					objFileOutputStream.close();
				}
				catch(Exception e) {
					e.printStackTrace();
			}
		}	
	}
}
