package XcelOperation;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextData {

	public static void main(String[] args) throws Exception {
		FileWriter file=new FileWriter("C:\\Users\\MAYURI\\Documents\\DataFiles\\Demo.txt",true);
		file.write("Welcome to my Page");
		file.write("\n");
		file.write("\n Good Morning to all");
		file.close();
		
		System.out.println("File Has been Created");
		
		
	}

}
