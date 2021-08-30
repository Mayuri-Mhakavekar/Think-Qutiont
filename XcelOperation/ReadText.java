package XcelOperation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) throws Exception {
		FileReader reader=new FileReader("C:\\Users\\MAYURI\\Documents\\DataFiles\\Book3.txt");
		int character;
		while((character =reader.read())!=-1) {
			System.out.println((char) character);
		}
		reader.close();
	}

}
