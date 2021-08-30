package XcelOperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextData2 {

	public static void main(String[] args) throws Exception {
		try  {
			FileWriter file=new FileWriter("C:\\Users\\MAYURI\\Documents\\DataFiles\\Demo1.txt",true);
			BufferedWriter wr=new BufferedWriter(file);
			wr.write("Welcome Welcomw Welcome");
			wr.newLine();
			wr.write("Thanks");
			wr.close();
		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
