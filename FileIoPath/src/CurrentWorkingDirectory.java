import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

public class CurrentWorkingDirectory {

    public static void main(String[] args) {

        String dir = printCurrentWorkingDirectory1();
        // printCurrentWorkingDirectory2();
        // printCurrentWorkingDirectory3();
        // printCurrentWorkingDirectory4();
        
        String path = dir + "/testdata/somedata.txt";
        System.out.println(path);
        try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String text = br.readLine();
			System.out.println(text);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        

    }

    // System Property
    private static String printCurrentWorkingDirectory1() {
        String userDirectory = System.getProperty("user.dir");
        System.out.println(userDirectory);
        return userDirectory;
    }

    // Path, Java 7
    private static String printCurrentWorkingDirectory2() {
        String userDirectory = Paths.get("")
                .toAbsolutePath()
                .toString();
        System.out.println(userDirectory);
        return userDirectory;
    }

    // File("")
    private static String printCurrentWorkingDirectory3() {
        String userDirectory = new File("").getAbsolutePath();
        System.out.println(userDirectory);
        return userDirectory;
    }

    // FileSystems
    private static String printCurrentWorkingDirectory4() {
        String userDirectory = FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString();
        System.out.println(userDirectory);
        return userDirectory;
    }

}