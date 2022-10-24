import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		String path = "data/output.txt";
		
		try {
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
		    bw.write("Hello, my name is Dmitriy");
		    bw.write("\n");
		    bw.write("This is an example of writing to text files");
		    bw.close();
		    fw.close();

		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
