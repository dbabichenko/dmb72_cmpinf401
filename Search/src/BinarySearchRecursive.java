public class BinarySearchRecursive {

	private static boolean binarySearch(int[] data, int key, int low, int high) {
		if (low > high){
			System.out.println("Element not found");
			return false;
		}

		int mid = (low + high) / 2;

		if (data[mid] < key)
			return binarySearch(data, key, mid + 1, high);
		else if (data[mid] > key)
			return binarySearch(data, key, low, mid - 1);
		else
			System.out.println("Found element at position " + mid);
			return true;
	}

	public static void main(String[] args) {
		int[] data = {1,6,10,23,32,43,53,56,76};
		int key = 23; // value that we are looking for
		binarySearch(data, key, 0, data.length - 1);
	}
}
