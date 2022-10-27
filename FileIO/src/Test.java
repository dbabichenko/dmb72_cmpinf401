import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		String inputPath = "data/input.csv";
		
		try {
			FileReader fr = new FileReader(inputPath);
			BufferedReader br = new BufferedReader(fr); 
			
			String line = null;
			
			
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
	      

	        
			br.close();
	        fr.close();
		} 
		catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
