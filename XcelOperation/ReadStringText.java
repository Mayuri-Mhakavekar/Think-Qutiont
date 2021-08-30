package XcelOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadStringText {

	public static void main(String[] args) throws Exception {
		FileReader reader1=new FileReader("C:\\Users\\MAYURI\\Documents\\DataFiles\\Book3.txt");
		BufferedReader file=new BufferedReader(reader1);
		String line;
		while((line=file.readLine())!=null) {
			System.out.println(line);
		}
		reader1.close();
	}

}
