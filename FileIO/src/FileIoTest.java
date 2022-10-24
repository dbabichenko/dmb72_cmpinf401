
public class FileIoTest {

	public static void main(String[] args) {
		String s = "a,b,c,d,e,f,g\n";
		s += "1,2,3,4,5,6,7\n";
		s += "p,q,r,s,t,u,v";
		
		String[] rows = s.split("\n");
		
		
		for(String row : rows) {
			// System.out.println(row);
			String[] cols = row.split(",");
			for(String col : cols) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		

	}

}
