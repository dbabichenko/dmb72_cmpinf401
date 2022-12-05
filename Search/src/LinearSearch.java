import java.util.ArrayList;

public class LinearSearch {

	public static void main(String[] args) {
		int[] l = {1, 5, 43, 34, 65, 3, 56, 65};
		int result = linearSearch(l, 65);
		System.out.println(result);
		
		result = linearSearch(l, 100);
		System.out.println(result);
		
		ArrayList<Integer> a = linearSearch2(l, 65);
		for(Integer i : a) {
			System.out.println(i);
		}

	}

	public static int linearSearch(int[] list, int searchTerm) {
		
		for(int i = 0; i< list.length; i++) {
			if(list[i] == searchTerm) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static ArrayList<Integer> linearSearch2(int[] list, int searchTerm) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i< list.length; i++) {
			if(list[i] == searchTerm) {
				result.add(i);
			}
		}	
		return result;
	}
}
