
public class TallyCounter {
	/*
	 * What does a tally counter do? (methods)
	 * What would its internal state be?
	 */
	
	private int count = 0;
	
	public void click() {
		count ++;
	}
	
	public void reset() {
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	public int addTwoNumbers(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
	
}
