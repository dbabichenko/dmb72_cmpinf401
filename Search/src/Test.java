
public class Test {

	public static void main(String[] args) {
		Object obj;
		
		String str = "Hello world";
		
		obj = str;
		
		String str1 = (String) obj;
		System.out.println(str1.length());
		

	}

}
