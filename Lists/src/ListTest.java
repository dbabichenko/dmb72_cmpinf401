import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i = 0; i<a.length; i++) {
			// System.out.println(a[i]);
		}
		
		double[] b = new double[10];
		for(int i = 0; i<b.length; i++) {
			// System.out.println(b[i]);
		}
		
		int[] c = {1, 7, 10, 20, 50, 5};
		for(int i = 0; i<c.length; i++) {
			// System.out.print(c[i] + " --> ");
			c[i] = c[i] * 2;
			// System.out.println(c[i]);
			
		}
		
		/*
		 * I have an array called "c"
		 * I can write a loop that follows this logic:
		 * For each element in "c", store the value of that element in some variable x
		 */
		for(int x : c) {
			// System.out.println(x);
		}
		
		int[] y = {1, 2, 3, 4, 5};
		System.out.println("Array: " + y.length);
		
		String s = "Hello world";
		System.out.println("String: " + s.length());
		
		ArrayList<String> als = new ArrayList<String>();
		als.add("Dmitriy");
		als.add("Bob");
		System.out.println("ArrayList: " + als.size());
		

	}

}
