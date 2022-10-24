
public class LinearSearch {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5, 6, 4};
		
		for(int i = 0; i<list.length; i++) {
			if(list[i] == 4) {
				System.out.println(i + ": found");
			}
			
		}

	}

}
