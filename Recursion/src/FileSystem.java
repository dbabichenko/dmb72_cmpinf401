import java.io.File;
import java.util.ArrayList;

public class FileSystem {
	public static ArrayList<File> folderList = new ArrayList<File>();
	
	public static void main(String[] args) {
		File[] files = new File("/Users/dbabichenko/Desktop/Software/").listFiles();
		listAllfiles(files);
	}
	public static void listAllfiles(File[] files) {
		ArrayList<File> fileList = new ArrayList<File>();
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("Directory: " + file.getName());
				folderList.add(file);
				listAllfiles(file.listFiles());  // Calls same method again.
			} else {
				System.out.println("File: " + file.getName());
			}
		}
	}

}
