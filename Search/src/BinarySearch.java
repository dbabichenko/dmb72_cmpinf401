public class BinarySearch {

	

	public static void main(String[] args) {
		int[] data = {1,6,10,23,32,43,53,56,76};
		int low = 0;
		int high = data.length - 1;
		int key = 23; // This is the element we are looking for

		while(high >= low) {
			int middle = (low + high) / 2;
			if(data[middle] == key) {
				System.out.println("Found match at location " + middle);
				break;
			}
			// Use the left side of the array
			if(data[middle] < key) {
				low = middle + 1;
			}
			// Use the right side of the array
			if(data[middle] > key) {
				high = middle - 1;
			}
		}
		System.out.println("Did not find a match");
	}
}
