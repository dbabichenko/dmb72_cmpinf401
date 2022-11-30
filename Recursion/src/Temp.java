
public class Temp {

	public static void main(String[] args) {
		System.out.println(sum());

	}
	
	public static int sum() {
		int[] someList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		for(int i : someList) {
			sum += i;
		}
		
		return sum;
	}

}
