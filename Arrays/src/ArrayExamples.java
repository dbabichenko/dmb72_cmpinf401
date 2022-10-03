
public class ArrayExamples {

	public static void main(String[] args) {
		/*
		10 chars
		5 integers
		10 booleans
		25 floats
		*/
		
		char[] charArray = new char[5];
		charArray[0] = 'a';
		charArray[1] = 'b';
		charArray[2] = 'c';
		charArray[3] = 'd';
		charArray[4] = 'e';
		
		// System.out.println(charArray[3]);
		
		String s = "Hello world";
		System.out.println("String length is a method: " + s.length());
		

		for(int i = 0; i<charArray.length; i++) {
			System.out.println("Element in position " + i + " = " + charArray[i]);
		}

		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int i = 0; i<intArray.length; i++) {
			System.out.println("Element in position " + i + " = " + intArray[i]);
		}
	}

}
